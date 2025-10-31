package Clase11.integradorUbert.estrategia;

import Clase11.integradorUbert.observer.Solicitud;

public class AprobarTodoEstrategia implements IEstrategiaAprobacion {
    @Override
    public boolean debeAceptar(Solicitud solicitud) {
        System.out.println("\t[Estrategia: Aceptar Todo] Aceptado.");
        return true;
    }
}