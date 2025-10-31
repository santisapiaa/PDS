package Clase11.integradorUbert.estrategia;

import Clase11.integradorUbert.observer.Solicitud;

public class AprobarViajesLargosEstrategia implements IEstrategiaAprobacion {

    private final int distanciaMinima;

    public AprobarViajesLargosEstrategia(int distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }

    @Override
    public boolean debeAceptar(Solicitud solicitud) {
        if (solicitud.getDistancia() >= distanciaMinima) {
            System.out.println("\t[Estrategia: Viajes Largos] Aceptado (Dist: " + solicitud.getDistancia() + "km >= " + distanciaMinima + "km)");
            return true;
        } else {
            System.out.println("\t[Estrategia: Viajes Largos] Rechazado (Dist: " + solicitud.getDistancia() + "km < " + distanciaMinima + "km)");
            return false;
        }
    }
}