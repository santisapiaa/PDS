package Clase6.TarjetaState.estados;

import Clase6.TarjetaState.Tarjeta;

public class Inhabilitada implements IEstadoTarjeta {
    
    @Override
    public void recargar(Tarjeta tarjeta, float importe) {
        tarjeta.modificarSaldo(importe);
        tarjeta.setEstado(new Activa());
    }

    @Override
    public boolean gastar(Tarjeta tarjeta, float importe) {
        return false; // No puede gastar
    }

    @Override
    public String getNombre() {
        return "INHABILITADA";
    }
}
