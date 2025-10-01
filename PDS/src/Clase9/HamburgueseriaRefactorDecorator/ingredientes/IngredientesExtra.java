package Clase9.HamburgueseriaRefactorDecorator.ingredientes;

public class IngredientesExtra {
    private int precio;
    private String tipo;

    public IngredientesExtra(int precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

}
