package Clase2.Ejercicio2;

public class CafeConsumoLocal extends Cafe{
    private boolean tieneCuchara = false;
    private boolean tienePlatito = false;

    @Override
    protected void presentar() {
        this.tieneCuchara = true;
        this.tienePlatito = true;
    }
}