package Clase6.Ejercicio1Practica4State;

import Clase6.Ejercicio1Practica4State.estados.IMedioDePago;
import Clase6.Ejercicio1Practica4State.estados.Inhabilitada;
import Clase6.Ejercicio1Practica4State.estados.IEstadoTarjeta;

public class Tarjeta implements IMedioDePago{

    private float saldo;
    private IEstadoTarjeta estado;

    public Tarjeta() {
        this.saldo = 0;
        this.estado = new Inhabilitada();
    }

    public void setEstado(IEstadoTarjeta estado) {
        this.estado = estado;
    }

    public IEstadoTarjeta getEstado() {
        return estado;
    }

    public void modificarSaldo(float importe) {
        this.saldo += importe;
    }

    @Override
    public void recargar(float importe) {
        if (importe <= 0) {
            throw new IllegalArgumentException("El importe de recarga debe ser positivo");
        }
        estado.recargar(this, importe);
    }

    @Override
    public boolean gastar(float importe) {
        if (importe <= 0) {
            throw new IllegalArgumentException("El importe de gasto debe ser positivo");
        }
        return estado.gastar(this, importe);
    }

    @Override
    public float saldoDisponible() {
        return saldo;
    }

    @Override
    public String toString() {
        return "TarjetaPrepaga{saldo=" + saldo + ", estado=" + estado.getNombre() + "}";
    }
}
