package Practicas.CuponDescStrategy.tiposDescuento;

import Practicas.CuponDescStrategy.producto.Producto;

public class DescuentoPorcentaje implements IDescuento{

    int porcentaje;

    public DescuentoPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int aplicarDescuento(Producto producto) {
        return producto.getPrecioDeLista() - (producto.getPrecioDeLista() * porcentaje / 100);
    }
}
