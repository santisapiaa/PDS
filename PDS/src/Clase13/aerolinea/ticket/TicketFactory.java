package Clase13.aerolinea.ticket;

import Clase13.aerolinea.pasajero.Pasajero;
import Clase13.aerolinea.precios.CalculadorPrecio;
import Clase13.aerolinea.precios.Precio;

public class TicketFactory {

    private final CalculadorPrecio calculadorPrecio;
    private final Precio config;

    public TicketFactory(CalculadorPrecio calculadorPrecio, Precio config) {
        this.calculadorPrecio = calculadorPrecio;
        this.config = config;
    }

    public TicketAereo crearTicket(String origen, String destino, Pasajero pasajero, double distanciaKm) {
        double precio = calculadorPrecio.calcularPrecio(pasajero, distanciaKm, config);
        return new TicketAereo(origen, destino, pasajero, precio, distanciaKm);
    }
}
