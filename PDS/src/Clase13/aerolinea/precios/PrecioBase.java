package Clase13.aerolinea.precios;

import Clase13.aerolinea.pasajero.Pasajero;

/**
 * Implementación de CalculadorPrecio que aplica un precio fijo sin descuentos.
 * Ejemplo de extensibilidad: nueva estrategia sin modificar código existente (OCP).
 */
public class PrecioBase implements CalculadorPrecio {

    @Override
    public double calcularPrecio(Pasajero pasajero, double distanciaKm, Precio config) {
        return config.calcularPrecioBase(distanciaKm);
    }
}

