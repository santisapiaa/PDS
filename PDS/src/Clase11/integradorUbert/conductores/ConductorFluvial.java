package Clase11.integradorUbert.conductores;

import Clase11.integradorUbert.utils.TipoVehiculo;

/**
 * (Nueva Clase) Implementación de Conductor para Fluvial (Parte II).
 */
public class ConductorFluvial extends ConductorBase {

    public ConductorFluvial(String id, String nombre) {
        super(id, nombre);
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.FLUVIAL; // [cite: 39]
    }
}