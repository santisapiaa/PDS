package Clase6.TarjetaState.estados;

public interface IMedioDePago {
    
    void recargar(float importe);

    boolean gastar(float importe);

    float saldoDisponible();
}
