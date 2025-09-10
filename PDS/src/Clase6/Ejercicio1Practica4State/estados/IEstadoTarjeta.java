package Clase6.Ejercicio1Practica4State.estados;

import Clase6.Ejercicio1Practica4State.Tarjeta;

public interface IEstadoTarjeta {

    void recargar(Tarjeta tarjeta, float importe);

    boolean gastar(Tarjeta tarjeta, float importe);

    String getNombre();
}