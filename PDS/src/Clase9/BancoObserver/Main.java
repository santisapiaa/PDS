package Clase9.BancoObserver;

import Clase9.BancoObserver.observables.Banco;
import Clase9.BancoObserver.observadores.Economista;
import Clase9.BancoObserver.observadores.ImportadorApple;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {

        ImportadorApple importadorApple = new ImportadorApple();
        Banco bancoDolar = new Banco();
        bancoDolar.agregarObservador(importadorApple);
        System.out.println(importadorApple.precioEnArsDelUltimoIphone());

        bancoDolar.subeElDolar();
        System.out.println(importadorApple.precioEnArsDelUltimoIphone());

        Economista pedro = new Economista();
        bancoDolar.agregarObservador(pedro);


        bancoDolar.subeElDolar();

    }

}
