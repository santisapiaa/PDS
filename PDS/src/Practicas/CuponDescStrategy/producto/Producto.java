package Practicas.CuponDescStrategy.producto;

public class Producto {

    private String descripcion;
    private int precioDeLista;

    public Producto(String desc, int precio) {
        this.descripcion = desc;
        this.precioDeLista = precio;
    }

    public int getPrecioDeLista() {
        return precioDeLista;
    }
}
