package Clase11.integradorUbert.estrategia;

import Clase11.integradorUbert.observer.Solicitud;

public interface IEstrategiaAprobacion {
    boolean debeAceptar(Solicitud solicitud);
}