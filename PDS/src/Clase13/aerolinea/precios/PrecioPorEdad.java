package Clase13.aerolinea.precios;

import Clase13.aerolinea.pasajero.Pasajero;

public class PrecioPorEdad implements CalculadorPrecio {

    private static final int EDAD_MINIMA_ADULTO = 18;
    private static final double DESCUENTO = 0.5;

    @Override
    public double calcularPrecio(Pasajero pasajero, double distanciaKm, Precio config) {
        double precioBase = config.calcularPrecioBase(distanciaKm);

        if (pasajero.getEdad() <= EDAD_MINIMA_ADULTO) {
            return precioBase * DESCUENTO;
        }
        return precioBase;
    }
}

