package Clase13.aerolinea.precios;

public class Precio {

    private static final double PRECIO_POR_KM = 50;

    private double precioPorKm;

    public Precio() {
        this.precioPorKm = PRECIO_POR_KM;
    }

    public Precio(double precioPorKm) {
        this.precioPorKm = precioPorKm;
    }

    public double getPrecioPorKm() {
        return precioPorKm;
    }

    public void setPrecioPorKm(double precioPorKm) {
        this.precioPorKm = precioPorKm;
    }

    public double calcularPrecioBase(double distanciaKm) {
        return distanciaKm * precioPorKm;
    }

}
