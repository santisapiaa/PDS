package Clase11.integradorUbert.conductores;

import Clase11.integradorUbert.utils.TipoVehiculo;

/**
 * (Nueva Clase) Implementación de Conductor para Auto (Parte II).
 */
public class ConductorAuto extends ConductorBase {

    public ConductorAuto(String id, String nombre) {
        super(id, nombre);
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.AUTO; // [cite: 39]
    }
}