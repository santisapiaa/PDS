package Clase9.HamburgueseriaRefactorDecorator.ingredientes;

public class Medallon {
    private int precio;
    private String sabor;

    public Medallon(int precio, String sabor) {
        this.precio = precio;
        this.sabor = sabor;
    }
    
    public int getPrecio() {
        return precio;
    }
}
