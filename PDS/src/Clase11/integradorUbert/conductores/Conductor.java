package Clase11.integradorUbert.conductores;

import Clase11.integradorUbert.estrategia.IEstrategiaAprobacion;
import Clase11.integradorUbert.observer.Observer;
import Clase11.integradorUbert.plataforma.PlataformaDeViajes;
import Clase11.integradorUbert.utils.TipoVehiculo;

/**
 * Interfaz Conductor (Modificada).
 * Se fusiona con Observer y se agregan métodos.
 */
public interface Conductor extends Observer { // El conductor ES un Observer

    /* Kilómetros totales conducidos */
    int kmTotales();

    /* Puntaje del conductor */
    int puntuacion();

    /* Nombre */
    String nombre();

    /* Id del conductor */
    String id();

    /**
     * (Agregado) Incrementa los KM (Opcional 7).
     */
    void incrementarKm(int km);

    /**
     * (Agregado) Devuelve el tipo de conductor (Parte II).
     */
    TipoVehiculo getTipo();

    /**
     * (Agregado) Asigna la plataforma al conductor.
     * Necesario para que el conductor pueda llamar a 'tomarViajeConId'.
     */
    void setPlataforma(PlataformaDeViajes plataforma);

    /**
     * (Agregado) Asigna la estrategia de aprobación (Opcional 6).
     */
    void setEstrategia(IEstrategiaAprobacion estrategia);
}