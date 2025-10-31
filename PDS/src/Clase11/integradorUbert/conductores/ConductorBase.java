package Clase11.integradorUbert.conductores;

import Clase11.integradorUbert.estrategia.AprobarTodoEstrategia;
import Clase11.integradorUbert.estrategia.IEstrategiaAprobacion;
import Clase11.integradorUbert.observer.Solicitud;
import Clase11.integradorUbert.plataforma.PlataformaDeViajes;
import Clase11.integradorUbert.plataforma.PlataformaViajesException;
import Clase11.integradorUbert.utils.TipoVehiculo;

/**
 * (Nueva Clase) Clase base abstracta para Conductores.
 * Implementa la lógica común, incluyendo el patrón Strategy.
 */
public abstract class ConductorBase implements Conductor {

    private final String id;
    private final String nombre;
    private int kmTotales = 0;
    private int puntuacion = 5; // Default

    // Referencia a la plataforma para poder tomar viajes
    protected PlataformaDeViajes plataforma;

    // Patrón Strategy
    protected IEstrategiaAprobacion estrategia;

    public ConductorBase(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        // Estrategia por defecto (Opcional 6)
        this.estrategia = new AprobarTodoEstrategia();
    }

    @Override
    public void setPlataforma(PlataformaDeViajes plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void setEstrategia(IEstrategiaAprobacion estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Implementación del método update (Patrón Observer).
     * Aquí se aplica el patrón Strategy.
     */
    @Override
    public void update(Solicitud solicitud) {
        System.out.println("Conductor " + nombre() + " (" + getTipo() + ") notificado para viaje " + solicitud.getIdViaje());

        if (plataforma == null) {
            System.err.println("Error: Conductor no asignado a una plataforma.");
            return;
        }

        // Aplicar Estrategia (Opcional 6)
        if (estrategia.debeAceptar(solicitud)) {
            try {
                // Si la estrategia aprueba, intenta tomar el viaje
                plataforma.tomarViajeConId(this, solicitud.getIdViaje()); //
            } catch (PlataformaViajesException e) {
                System.out.println("Conductor " + nombre() + ": No pude tomar el viaje " + solicitud.getIdViaje() + ". Causa: " + e.getMessage());
            }
        }
    }

    // Getters e implementaciones
    @Override
    public int kmTotales() { return kmTotales; }
    @Override
    public int puntuacion() { return puntuacion; }
    @Override
    public String nombre() { return nombre; }
    @Override
    public String id() { return id; }

    @Override
    public void incrementarKm(int km) {
        this.kmTotales += km; // Opcional 7
    }

    // Método abstracto para ser implementado por subclases
    @Override
    public abstract TipoVehiculo getTipo();
}