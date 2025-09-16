package Clase5.EjercicioStateCafe.conState.estados;

import Clase5.EjercicioStateCafe.conState.CafeVending;

public class Inactivo implements CafeVendingState{


    // TODO: Terminar de implementar

    private String mensajeActual = "Acerque su tarjeta";
    private final CafeVending cafetera;

    public Inactivo(CafeVending cafetera) {
        this.cafetera = cafetera;
    }

    @Override
    public void seleccionCafeSolo() {
        mensajeActual = "Te dije que primero la tarjeta";
    }

    @Override
    public void seleccionCafeCortado() {
        mensajeActual = "Sino pagas no hay nada";
    }

    @Override
    public String indicacionDisplay() {
        return mensajeActual;
    }

    @Override
    public void confirmarPago() {
        // "Pasar" a estado EsperandoSeleccion
        cafetera.setEstadoActual( new EsperandoSeleccion(cafetera) );
    }
}
