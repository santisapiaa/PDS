package Clase9.HamburgueseriaRefactorDecorator.decorator;

import Clase9.HamburgueseriaRefactorDecorator.ingredientes.IngredientesExtra;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.Medallon;

public abstract class ProductoFacturableDecorator implements ProductoFacturable {

    protected ProductoFacturable productoDecorado;

    public ProductoFacturableDecorator(ProductoFacturable productoDecorado) {
        this.productoDecorado = productoDecorado;
    }

    // Delega la ejecución del cálculo del precio base
    @Override
    public void calcularPrecioFinal() {
        productoDecorado.calcularPrecioFinal();
    }

    // Delega la ejecución de la regla de negocio
    @Override
    public boolean puedeFacturarse() {
        return productoDecorado.puedeFacturarse();
    }

    // Este método es abstracto, ya que cada decorador modificará el precio de forma distinta
    @Override
    public abstract double getPrecioFinal();

    // Delega la adición de componentes
    @Override
    public void agregarMedallon(Medallon medallon) {
        productoDecorado.agregarMedallon(medallon);
    }

    // Delega la adición de componentes
    @Override
    public void agregarIngredienteExtra(IngredientesExtra ingredienteExtra) {
        productoDecorado.agregarIngredienteExtra(ingredienteExtra);
    }
}