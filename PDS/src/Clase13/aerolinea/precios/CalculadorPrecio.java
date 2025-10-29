package Clase13.aerolinea.precios;

import Clase13.aerolinea.pasajero.Pasajero;

public interface CalculadorPrecio {

    double calcularPrecio(Pasajero pasajero, double distanciaKm, Precio config);
}