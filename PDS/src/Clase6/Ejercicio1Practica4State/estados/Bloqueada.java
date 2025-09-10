package Clase6.Ejercicio1Practica4State.estados;

import Clase6.Ejercicio1Practica4State.Tarjeta;

public class Bloqueada implements IEstadoTarjeta{
    
    @Override
    public void recargar(Tarjeta tarjeta, float importe) {
        tarjeta.modificarSaldo(importe);
        if (tarjeta.saldoDisponible() > 0) {
            tarjeta.setEstado(new Activa());
        }
    }

    @Override
    public boolean gastar(Tarjeta tarjeta, float importe) {
        return false; // No puede gastar en este estado
    }

    @Override
    public String getNombre() {
        return "BLOQUEADA";
    }
}
