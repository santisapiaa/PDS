package Clase11.integradorUbert.plataforma;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.observer.Observable;
import Clase11.integradorUbert.observer.Observer;
import Clase11.integradorUbert.observer.Solicitud;
import Clase11.integradorUbert.observer.SolicitudaDeExistenciaDeViaje;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.viaje.EstadoDeViaje;
import Clase11.integradorUbert.viaje.Viaje;

import java.util.*;
import java.util.stream.Collectors;

public abstract class PlataformaBase implements PlataformaDeViajes, Observable {

    private final Map<String, Viaje> viajes = new HashMap<>();
    private final Set<Observer> observers = new HashSet<>();


    // --- PATRÓN FACTORY METHOD ---
    protected abstract Viaje crearViaje(String id, Pasajero unPasajero, int km);
    protected abstract boolean esTipoConductorValido(Conductor conductor);


    @Override
    public void pedirViajePara(Pasajero unPasajero, int km) throws PlataformaViajesException {
        String id = UUID.randomUUID().toString();
        Viaje nuevoViaje = crearViaje(id, unPasajero, km);
        viajes.put(nuevoViaje.getId(), nuevoViaje);
        System.out.println("Plataforma: Nuevo viaje " + id + " (" + nuevoViaje.getTipoRequerido() + ") PENDIENTE.");
        Solicitud solicitud = new SolicitudaDeExistenciaDeViaje(nuevoViaje.getId(), nuevoViaje.getDistancia());
        notificar(solicitud);
    }

    @Override
    public synchronized void tomarViajeConId(Conductor conductor, String idViaje) throws PlataformaViajesException {
        Viaje viajeEncontrado = obtenerViajePorId(idViaje);

        if (viajeEncontrado.estadoDeViaje() != EstadoDeViaje.PENDIENTE) {
            throw new PlataformaViajesException("El viaje " + idViaje + " ya fue tomado o no está disponible.");
        }

        if (viajeEncontrado.getTipoRequerido() != conductor.getTipo()) {
            throw new PlataformaViajesException("Conductor " + conductor.nombre() + " no es del tipo " + viajeEncontrado.getTipoRequerido());
        }

        viajeEncontrado.asignarConductor(conductor);

        // --- ARREGLO 1 ---
        // El conductor ahora está ocupado, ya no está "en espera".
        this.eliminarObservador(conductor);
        // --- FIN ARREGLO 1 ---

        System.out.println("Plataforma: Viaje " + idViaje + " asignado a " + conductor.nombre() + ". Estado: " + viajeEncontrado.estadoDeViaje());
        System.out.println("Plataforma: Conductor " + conductor.nombre() + " ya no está en espera.");
    }

    @Override
    public void finalizarViaje(String idViaje) throws PlataformaViajesException {
        Viaje viajeEncontrado = obtenerViajePorId(idViaje);

        if (viajeEncontrado.estadoDeViaje() != EstadoDeViaje.INICIADO) {
            throw new PlataformaViajesException("El viaje no puede finalizarse (Estado: " + viajeEncontrado.estadoDeViaje() + ")");
        }

        viajeEncontrado.finalizarViaje();

        Conductor conductor = viajeEncontrado.getConductor();
        if (conductor != null) {
            conductor.incrementarKm(viajeEncontrado.getDistancia());

            // --- ARREGLO 2 ---
            // El conductor ha terminado y vuelve a estar "en espera".
            this.agregarObservador(conductor);
            // --- FIN ARREGLO 2 ---
        }
    }

    private Viaje obtenerViajePorId(String id) throws PlataformaViajesException {
        Viaje viaje = viajes.get(id);
        if (viaje == null) {
            throw new PlataformaViajesException("No existe viaje con ese Id");
        }
        return viaje;
    }

    // --- Métodos de Reporte ---
    public List<Viaje> getViajesRealizados() {
        return viajes.values().stream()
                .filter(v -> v.estadoDeViaje() == EstadoDeViaje.FINALIZADO)
                .collect(Collectors.toList());
    }

    public int getTotalKilometrosRecorridos() {
        return getViajesRealizados().stream()
                .mapToInt(Viaje::getDistancia)
                .sum();
    }

    /**
     * (Agregado para la prueba) Devuelve todos los viajes
     */
    public Collection<Viaje> getTodosLosViajes() {
        return viajes.values();
    }

    // --- MÉTODOS OBSERVABLE ---

    @Override
    public void agregarObservador(Observer observer) {
        if (observer instanceof Conductor) {
            Conductor conductor = (Conductor) observer;
            if (esTipoConductorValido(conductor)) {
                observers.add(observer);
                conductor.setPlataforma(this);
                System.out.println("Plataforma: Conductor " + conductor.nombre() + " (" + conductor.getTipo() + ") se ha conectado.");
            } else {
                System.out.println("Plataforma: Conductor " + conductor.nombre() + " (" + conductor.getTipo() + ") RECHAZADO (Tipo incorrecto).");
            }
        }
    }

    @Override
    public void eliminarObservador(Observer observer) {
        observers.remove(observer);
        if (observer instanceof Conductor) {
            // Ya no le pasamos la plataforma
        }
    }

    @Override
    public void notificar(Solicitud solicitud) {
        // --- ARREGLO 3 (ConcurrentModificationException) ---
        // Iteramos sobre una COPIA (new HashSet<>(observers))
        for (Observer observer : new HashSet<>(observers)) {
            observer.update(solicitud);
        }
        // --- FIN ARREGLO 3 ---
    }
}