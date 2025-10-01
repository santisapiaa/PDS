package Clase9.HamburgueseriaRefactorDecorator;

import Clase9.HamburgueseriaRefactorDecorator.decorator.DescuentoEnEfectivo;
import Clase9.HamburgueseriaRefactorDecorator.decorator.EnvioADomicilio;
import Clase9.HamburgueseriaRefactorDecorator.decorator.ProductoFacturable;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.IngredientesExtra;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.Medallon;
import Clase9.HamburgueseriaRefactorDecorator.ingredientes.Pan;

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

        // --- PRUEBA CON DECORATOR (hamburguesa 1) ---
        System.out.println("--- PRUEBA 1: Hamburguesa con Envío a Domicilio y Costo Fijo ---");

        Hamburguesa hamburguesa = new Hamburguesa(p1);
        hamburguesa.agregarIngredienteExtra(i3); // 20
        hamburguesa.agregarMedallon(m3); // 650
        // Precio Base = 150 (Pan) + 20 (Ing.) + 650 (Med.) = 820

        // 1. Componente Base
        ProductoFacturable comboFacturable = hamburguesa;

        // 2. Decorador 1: Descuento en Efectivo (añade 25.0) -> 820 + 25.0 = 845.0
        comboFacturable = new DescuentoEnEfectivo(comboFacturable);

        // 3. Decorador 2: Envío a Domicilio (aplica 5% a 845.0) -> 845.0 * 1.05 = 887.25
        comboFacturable = new EnvioADomicilio(comboFacturable);

        if (comboFacturable.puedeFacturarse()) {
            System.out.println("El producto puede ser facturado.");

            // calcularPrecioFinal() calcula el precio base de la hamburguesa
            comboFacturable.calcularPrecioFinal();

            // getPrecioFinal() llama a los decoradores secuencialmente
            double precioFinal = comboFacturable.getPrecioFinal();
            System.out.printf("El total FINAL de la COMPRA (con servicios) es: %.2f%n", precioFinal);
        } else {
            System.out.println("El producto no puede ser facturado.");
        }

        System.out.println("\n--- PRUEBA 2: Hamburguesa base sin servicios adicionales ---");

        Hamburguesa hamburguesa2 = new Hamburguesa(p2);
        hamburguesa2.agregarIngredienteExtra(i1); // 30
        hamburguesa2.agregarIngredienteExtra(i2); // 15
        hamburguesa2.agregarMedallon(m1); // 300
        // Precio Base = 250 (Pan) + 45 (Ing.) + 300 (Med.) = 595

        // REGLA: Medallones (1) < Ingredientes (2). No puede facturarse.
        if (hamburguesa2.puedeFacturarse()) {
            System.out.println("La hamburguesa2 puede ser facturada.");
            hamburguesa2.calcularPrecioFinal();
            System.out.printf("El total FINAL de la COMPRA es: %.2f%n", hamburguesa2.getPrecioFinal());
        } else {
            System.out.println("La hamburguesa2 no puede ser facturada. Desea agregar un medallon (1) o quitar ingredientes (0)?");
            String rta = scanner.nextLine();
            if (rta.equals("1")) { // Usar .equals para comparar Strings
                hamburguesa2.agregarMedallon(m2); // Ahora 2 medallones (300+120=420), 2 ingredientes (30+15=45)
            }
            if (rta.equals("0")) {
                hamburguesa2.quitarIngredienteExtra(i2); // Ahora 1 ingrediente (30), 1 medallón (300)
            }
            System.out.println("La hamburguesa2 puede ser facturada.");
            hamburguesa2.calcularPrecioFinal();
            System.out.printf("El total FINAL de la COMPRA es: %.2f%n", hamburguesa2.getPrecioFinal());
        }
        scanner.close();
    }
}