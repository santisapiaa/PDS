package Clase9.HamburgueseriaRefactorDecorator.decorator;

import Clase9.HamburgueseriaRefactorDecorator.ingredientes.IngredientesExtra;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.Medallon;

public interface ProductoFacturable {
    // Método clave para el Decorator: obtiene el precio final (modificable por decoradores)
    double getPrecioFinal();

    // Método para la regla de negocio
    boolean puedeFacturarse();

    // Método para calcular el precio base (de la hamburguesa)
    void calcularPrecioFinal();

    // Métodos para agregar componentes, delegados a la hamburguesa
    void agregarMedallon(Medallon medallon);
    void agregarIngredienteExtra(IngredientesExtra ingredienteExtra);
}
