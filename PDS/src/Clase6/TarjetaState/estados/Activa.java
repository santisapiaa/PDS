package Clase6.TarjetaState.estados;

import Clase6.TarjetaState.Tarjeta;

public class Activa implements IEstadoTarjeta{
    
    @Override
    public void recargar(Tarjeta tarjeta, float importe) {
        tarjeta.modificarSaldo(importe);
    }

    @Override
    public boolean gastar(Tarjeta tarjeta, float importe) {
        tarjeta.modificarSaldo(-importe);
        if (tarjeta.saldoDisponible() < 0) {
            tarjeta.setEstado(new Bloqueada());
        }
        return true;
    }

    @Override
    public String getNombre() {
        return "ACTIVA";
    }
}
