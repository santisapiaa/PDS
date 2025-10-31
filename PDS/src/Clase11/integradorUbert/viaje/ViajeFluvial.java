package Clase11.integradorUbert.viaje;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.utils.TipoVehiculo;

/**
 * (Nueva Clase) Implementación de Viaje para Ubert Water (Parte II).
 * Es idéntica a ViajeImpl, pero para FLUVIAL.
 */
public class ViajeFluvial implements Viaje {

    private final String id;
    private Conductor conductor;
    private final Pasajero pasajero;
    private final int distancia;
    private EstadoDeViaje estadoDeViaje;

    public ViajeFluvial(String id, Pasajero pasajero, int distancia) {
        this.id = id;
        this.pasajero = pasajero;
        this.distancia = distancia;
        this.estadoDeViaje = EstadoDeViaje.PENDIENTE;
    }

    @Override
    public void asignarConductor(Conductor unConductor) {
        if (unConductor.getTipo() != this.getTipoRequerido()) {
            return;
        }
        this.conductor = unConductor;
        this.estadoDeViaje = EstadoDeViaje.INICIADO;
    }

    @Override
    public void finalizarViaje() {
        this.estadoDeViaje = EstadoDeViaje.FINALIZADO;
        System.out.println("Viaje " + id + " (Fluvial) finalizado.");
    }

    @Override
    public String getId() { return id; }
    @Override
    public int getDistancia() { return distancia; }
    @Override
    public EstadoDeViaje estadoDeViaje() { return estadoDeViaje; }
    @Override
    public Conductor getConductor() { return conductor; }
    @Override
    public Pasajero getPasajero() { return pasajero; }

    @Override
    public TipoVehiculo getTipoRequerido() {
        return TipoVehiculo.FLUVIAL; // Esta clase es para Fluvial
    }
}