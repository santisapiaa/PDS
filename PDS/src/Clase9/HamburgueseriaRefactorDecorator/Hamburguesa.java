package Clase9.HamburgueseriaRefactorDecorator;

import Clase9.HamburgueseriaRefactorDecorator.decorator.ProductoFacturable;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.IngredientesExtra;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.Medallon;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.Pan;

import java.util.ArrayList;
import java.util.List;

// Implementar la nueva interfaz
public class Hamburguesa implements ProductoFacturable {
    private List<Medallon> medallones;
    private List<IngredientesExtra> ingredientesExtras;
    private Pan pan;
    private double precioBase; // Ahora representa el precio base, antes de decoradores

    public Hamburguesa(Pan pan) {
        this.medallones = new ArrayList<>();
        this.ingredientesExtras = new ArrayList<>();
        this.pan = pan;
        this.precioBase = 0;
    }

    @Override
    public void calcularPrecioFinal() {
        int precioTotalMedallon = 0;
        int precioTotalIng = 0;

        for (int i = 0; i < medallones.size(); i++) {
            precioTotalMedallon += medallones.get(i).getPrecio();
        }
        for (int i = 0; i < ingredientesExtras.size(); i++) {
            precioTotalIng += ingredientesExtras.get(i).getPrecio();
        }

        // Almacena el precio base
        this.precioBase = (double)precioTotalIng + (double)precioTotalMedallon + pan.getPrecio();

        System.out.println("El total del PAN es: " + pan.getPrecio());
        System.out.println("El total de los INGREDIENTES es: " + precioTotalIng);
        System.out.println("El total de los MEDALLONES es: " + precioTotalMedallon);
        System.out.printf("El total BASE de la COMPRA es: %.2f%n", this.precioBase);
    }

    // El decorador usará este método para obtener el precio al que aplicará su modificación
    @Override
    public double getPrecioFinal() {
        // Asegura que el precio base esté calculado antes de ser retornado
        if (this.precioBase == 0) {
            calcularPrecioFinal();
        }
        return this.precioBase;
    }

    @Override
    public boolean puedeFacturarse() {
        // Regla: al menos un medallón Y no más ingredientes que medallones
        return !medallones.isEmpty() && ingredientesExtras.size() <= medallones.size();
    }

    @Override
    public void agregarMedallon(Medallon medallon) {
        medallones.add(medallon);
        this.precioBase = 0; // Marca para recalcular
    }

    @Override
    public void agregarIngredienteExtra(IngredientesExtra ingredienteExtra) {
        ingredientesExtras.add(ingredienteExtra);
        this.precioBase = 0; // Marca para recalcular
    }

    public void quitarIngredienteExtra(IngredientesExtra ingredientesExtra) {
        ingredientesExtras.remove(0);
        this.precioBase = 0; // Marca para recalcular
    }
}