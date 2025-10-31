package Clase11.integradorUbert.plataforma;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.utils.TipoVehiculo;
import Clase11.integradorUbert.viaje.Viaje;
import Clase11.integradorUbert.viaje.ViajeFluvial;

/**
 * (Nueva Clase) Implementación de la Plataforma para Water (Parte II).
 * Hereda de PlataformaBase e implementa el Factory Method.
 */
public class UbertWater extends PlataformaBase {

    public UbertWater() {
        System.out.println("--- Plataforma Ubert WATER iniciada ---");
    }

    @Override
    protected Viaje crearViaje(String id, Pasajero unPasajero, int km) {
        // Fábrica de Water: crea un ViajeFluvial
        return new ViajeFluvial(id, unPasajero, km);
    }

    @Override
    protected boolean esTipoConductorValido(Conductor conductor) {
        // Esta plataforma solo acepta conductores FLUVIALES
        return conductor.getTipo() == TipoVehiculo.FLUVIAL;
    }
}