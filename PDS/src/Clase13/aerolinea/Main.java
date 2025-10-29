package Clase13.aerolinea;

import Clase13.aerolinea.pasajero.Pasajero;
import Clase13.aerolinea.precios.CalculadorPrecio;
import Clase13.aerolinea.precios.Precio;
import Clase13.aerolinea.precios.PrecioPorEdad;
import Clase13.aerolinea.ticket.TicketAereo;
import Clase13.aerolinea.ticket.TicketFactory;

public class Main {

    public static void main(String[] args) {

        Pasajero unPasajero = new Pasajero("Martin", 38);

        Precio config = new Precio();

        CalculadorPrecio calculador = new PrecioPorEdad();
        TicketFactory factory = new TicketFactory(calculador, config);

        double distanciaBUEaBRC = 1500.0; // kilómetros
        TicketAereo ticketBUEaBRC = factory.crearTicket("BUE", "BRC", unPasajero, distanciaBUEaBRC);

        System.out.printf("Origen: %s. Destino: %s Precio: %.0f (Distancia: %.0f km)%n",
                ticketBUEaBRC.getOrigen(),
                ticketBUEaBRC.getDestino(),
                ticketBUEaBRC.getPrecio(),
                ticketBUEaBRC.getDistanciaKm());

        Pasajero unMenor = new Pasajero("Sofia", 12);
        TicketAereo ticketMenor = factory.crearTicket("BUE", "BRC", unMenor, distanciaBUEaBRC);

        System.out.printf("Origen: %s. Destino: %s Precio: %.0f (Menor de edad - 50%% descuento)%n",
                ticketMenor.getOrigen(),
                ticketMenor.getDestino(),
                ticketMenor.getPrecio());
    }
}
