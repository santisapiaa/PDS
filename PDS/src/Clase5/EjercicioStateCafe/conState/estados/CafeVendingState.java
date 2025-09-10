package Clase5.EjercicioStateCafe.conState.estados;

public interface CafeVendingState {

    void seleccionCafeSolo();
    void seleccionCafeCortado();
    String indicacionDisplay();

    void confirmarPago();

}
