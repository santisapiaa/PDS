package Clase3.Ejercicio2.refactor.producto;

public class Producto {
    private String descripcion;
    private int precioDeLista;

    public Producto(String descripcion, int precioDeLista) {
        this.descripcion = descripcion;
        this.precioDeLista = precioDeLista;
    }

    public int getPrecioDeLista() {
        return precioDeLista;
    }
}
