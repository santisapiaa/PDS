package Clase13.aerolinea.ticket;

import Clase13.aerolinea.pasajero.Pasajero;

public class TicketAereo {

    private final Pasajero pasajero;
    private final double precio;
    private final String origen;
    private final String destino;
    private final double distanciaKm;

    public TicketAereo(String origen, String destino, Pasajero pasajero, double precio, double distanciaKm) {
        this.origen = origen;
        this.destino = destino;
        this.pasajero = pasajero;
        this.precio = precio;
        this.distanciaKm = distanciaKm;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
