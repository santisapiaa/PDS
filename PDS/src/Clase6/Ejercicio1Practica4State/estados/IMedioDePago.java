package Clase6.Ejercicio1Practica4State.estados;

public interface IMedioDePago {
    
    void recargar(float importe);

    boolean gastar(float importe);

    float saldoDisponible();
}
