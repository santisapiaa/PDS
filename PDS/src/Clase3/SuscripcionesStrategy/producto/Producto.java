package Clase3.SuscripcionesStrategy.producto;

public class Producto {
    private String descripcion;
    private int precio;

    public Producto(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }
}
