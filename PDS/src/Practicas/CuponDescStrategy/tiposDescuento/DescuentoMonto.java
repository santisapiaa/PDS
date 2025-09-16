package Practicas.CuponDescStrategy.tiposDescuento;

import Practicas.CuponDescStrategy.producto.Producto;

public class DescuentoMonto implements IDescuento{

    int monto;

    public DescuentoMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int aplicarDescuento(Producto producto) {
        return producto.getPrecioDeLista() - monto;
    }

}
