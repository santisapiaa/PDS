package Clase5.EjercicioEjemplo;

import java.util.HashSet;

import Clase5.EjercicioEjemplo.vendedores.IVendedor;

public class Empresa {

    private HashSet<IVendedor> vendedores = new HashSet<>();

    public void sumarVendedor(IVendedor unVendedor) {
        this.vendedores.add(unVendedor);
    }

    public void repartirRegalias(float cuantoACadaVendedor) {
        for (IVendedor vendedor : this.vendedores) {
            vendedor.recibirComision(cuantoACadaVendedor);
        }
    }

    public float facturacionTotal() {
        float total = 0;
        for (IVendedor unVendedor : vendedores) {
            total = total + unVendedor.cuandoFacturas();
        }
        return total;
    }

}