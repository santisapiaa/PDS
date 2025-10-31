package Clase11.integradorUbert.plataforma;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.utils.TipoVehiculo;
import Clase11.integradorUbert.viaje.Viaje;
import Clase11.integradorUbert.viaje.ViajeImpl;

/**
 * (Nueva Clase) Implementación de la Plataforma para Autos.
 * Hereda de PlataformaBase e implementa el Factory Method.
 */
public class UbertAuto extends PlataformaBase {

    public UbertAuto() {
        System.out.println("--- Plataforma Ubert AUTO iniciada ---");
    }

    @Override
    protected Viaje crearViaje(String id, Pasajero unPasajero, int km) {
        // Fábrica de Autos: crea un ViajeImpl (de Auto)
        return new ViajeImpl(id, unPasajero, km);
    }

    @Override
    protected boolean esTipoConductorValido(Conductor conductor) {
        // Esta plataforma solo acepta conductores de AUTO
        return conductor.getTipo() == TipoVehiculo.AUTO;
    }
}
