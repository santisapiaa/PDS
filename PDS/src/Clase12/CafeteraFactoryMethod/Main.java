package Clase12.CafeteraFactoryMethod;

import Clase12.CafeteraFactoryMethod.creators.CafeCreator;
import Clase12.CafeteraFactoryMethod.creators.CafeteraNespresso;
import Clase12.CafeteraFactoryMethod.creators.CafeteraVending;
import Clase12.CafeteraFactoryMethod.productos.Cafe;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        CafeCreator nespresso = new CafeteraNespresso();
        CafeCreator vending = new CafeteraVending();

        // Productos
        HashSet<Cafe> cafesConsumidos = new HashSet<>();
        cafesConsumidos.add(nespresso.preparar());
        cafesConsumidos.add(vending.preparar());

        // Calcular cafe consumido en cm3
        int cafeConsumidoTotal = cafesConsumidos
                .stream()
                .mapToInt(cafe -> cafe.medida())
                .sum();
        System.out.printf("Consumi %d ml de cafe %n", cafeConsumidoTotal );

        // Cafeterias visitadas
        LinkedHashSet<Cafe> cafetereriasVisitadas = new LinkedHashSet<Cafe>();


        // Tomar un cafe
        

    }
}
