package Clase11.integradorUbert.pasajeros;

/**
 * (Nueva Clase) Implementación de Pasajero para pruebas.
 */
public class PasajeroImpl implements Pasajero {
    private String nombre;

    public PasajeroImpl(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}