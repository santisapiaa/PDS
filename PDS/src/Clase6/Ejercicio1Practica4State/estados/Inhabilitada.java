package Clase6.Ejercicio1Practica4State.estados;

import Clase6.Ejercicio1Practica4State.Tarjeta;

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
