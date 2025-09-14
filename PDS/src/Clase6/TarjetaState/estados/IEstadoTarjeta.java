package Clase6.TarjetaState.estados;

import Clase6.TarjetaState.Tarjeta;

public interface IEstadoTarjeta {

    void recargar(Tarjeta tarjeta, float importe);

    boolean gastar(Tarjeta tarjeta, float importe);

    String getNombre();
}