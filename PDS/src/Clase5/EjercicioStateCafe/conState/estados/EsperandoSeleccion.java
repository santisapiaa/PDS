package Clase5.EjercicioStateCafe.conState.estados;

import Clase5.EjercicioStateCafe.conState.CafeVending;

public class EsperandoSeleccion implements CafeVendingState {

    private final CafeVending cafetera;

    // TODO: Terminar de implementar


    public EsperandoSeleccion(CafeVending cafetera) {
        this.cafetera = cafetera;
    }


    @Override
    public void seleccionCafeSolo() {

    }

    @Override
    public void seleccionCafeCortado() {

    }

    @Override
    public String indicacionDisplay() {
        return "Estamos en estado EsperandoSeleccion";
    }

    @Override
    public void confirmarPago() {

    }
}
