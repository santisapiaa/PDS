package Clase11.integradorUbert.viaje;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.utils.TipoVehiculo; // (Asegúrate de tener este import)

public class ViajeImpl implements Viaje {

    private final String id;
    private Conductor conductor;
    private final Pasajero pasajero;
    private final int distancia;
    private EstadoDeViaje estadoDeViaje;

    public ViajeImpl(String id, Pasajero pasajero, int distancia) {
        this.id = id;
        this.pasajero = pasajero;
        this.distancia = distancia;
        this.estadoDeViaje = EstadoDeViaje.PENDIENTE; //
    }


    @Override
    public void asignarConductor(Conductor unConductor) {
        if (unConductor.getTipo() != this.getTipoRequerido()) {
            System.err.println("Error: Tipo de conductor incorrecto para este viaje.");
            return;
        }
        conductor = unConductor;
        estadoDeViaje = EstadoDeViaje.INICIADO; //
    }

    @Override
    public void finalizarViaje() {
        this.estadoDeViaje = EstadoDeViaje.FINALIZADO; //
        System.out.println("Viaje " + id + " (Auto) finalizado.");
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getDistancia() {
        return distancia; // <-- ARREGLO CLAVE
    }

    @Override
    public EstadoDeViaje estadoDeViaje() {
        return estadoDeViaje; // <-- ARREGLO CLAVE
    }

    // --- Métodos agregados (necesarios) ---
    @Override
    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public Pasajero getPasajero() {
        return pasajero;
    }

    @Override
    public TipoVehiculo getTipoRequerido() {
        return TipoVehiculo.AUTO;
    }
}