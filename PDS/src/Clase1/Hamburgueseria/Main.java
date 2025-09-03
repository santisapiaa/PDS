package Clase1.Hamburgueseria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pan p1 = new Pan(150, "De campo");
        Pan p2 = new Pan(250, "De papa");

        Medallon m1 = new Medallon(300, "Carne");
        Medallon m2 = new Medallon(120, "Pollo");
        Medallon m3 = new Medallon(650, "Vegetariano");

        IngredientesExtra i1 = new IngredientesExtra(30, "Tomate");
        IngredientesExtra i2 = new IngredientesExtra(15, "Lechuga");
        IngredientesExtra i3 = new IngredientesExtra(20, "Cebolla");
        
        Hamburguesa hamburguesa = new Hamburguesa(p1);

        hamburguesa.agregarIngredienteExtra(i3);
        hamburguesa.agregarMedallon(m3);

        Hamburguesa hamburguesa2 = new Hamburguesa(p2);

        hamburguesa2.agregarIngredienteExtra(i1);
        hamburguesa2.agregarIngredienteExtra(i2);
        hamburguesa2.agregarMedallon(m1);

        if (hamburguesa.puedeFacturarse()) {
            System.out.println("La hamburguesa puede ser facturada.");
            hamburguesa.calcularPrecioFinal();
        } else {
            System.out.println("La hamburguesa no puede ser facturada.");
        }

        if (hamburguesa2.puedeFacturarse()) {
            System.out.println("La hamburguesa2 puede ser facturada.");
            hamburguesa2.calcularPrecioFinal();
        } else {
            System.out.println("La hamburguesa2 no puede ser facturada. Desea agregar un medallon (1) o quitar ingredientes (0)?");
            String rta = scanner.nextLine();
            if (rta == "1") {
                hamburguesa2.agregarMedallon(m2);
            }
            if (rta == "0") {
                hamburguesa2.quitarIngredienteExtra(i2);
            }
            System.out.println("La hamburguesa2 puede ser facturada.");
            hamburguesa2.calcularPrecioFinal();
        }
    }
}
