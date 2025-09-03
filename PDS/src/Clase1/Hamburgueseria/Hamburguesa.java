package Clase1.Hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Medallon> medallones;
    private List<IngredientesExtra> ingredientesExtras;
    private Pan pan;
    private double precioFinal;

    public Hamburguesa(Pan pan) {        
        this.medallones = new ArrayList<>();
        this.ingredientesExtras = new ArrayList<>();
        this.pan = pan;
    }

    public void calcularPrecioFinal() {
        int precioTotalMedallon = 0;
        int precioTotalIng = 0;

        for (int i = 0; i < medallones.size(); i++) {
            precioTotalMedallon += medallones.get(i).getPrecio();
        }
        for (int i = 0; i < ingredientesExtras.size(); i++) {
            precioTotalIng += ingredientesExtras.get(i).getPrecio();
        }

        precioFinal = precioTotalIng + precioTotalMedallon + pan.getPrecio();

        System.out.println("El total del PAN es: " + pan.getPrecio());
        System.out.println("El total de los INGREDIENTES es: " + precioTotalIng);
        System.out.println("El total de los MEDALLONES es: " + precioTotalMedallon);
        System.out.println("El total de la COMPRA es: " + precioFinal);
    }

    public boolean puedeFacturarse() {
        boolean puedeONo;
        if (medallones.isEmpty() || ingredientesExtras.size() > medallones.size()) {
            puedeONo = false;
        }
        else {
            puedeONo = true;
        }
        return puedeONo;
    }

    public void agregarMedallon(Medallon medallon) {
        medallones.add(medallon);
    }

    public void agregarIngredienteExtra(IngredientesExtra ingredienteExtra) {
        ingredientesExtras.add(ingredienteExtra);
    }

    public void quitarIngredienteExtra(IngredientesExtra ingredientesExtra) {
        ingredientesExtras.remove(0);
    }
}