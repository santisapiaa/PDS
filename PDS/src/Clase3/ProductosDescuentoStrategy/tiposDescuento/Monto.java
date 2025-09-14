package Clase3.ProductosDescuentoStrategy.tiposDescuento;

import Clase3.ProductosDescuentoStrategy.producto.Producto;

public class Monto implements IDescuento {
    private final int monto = 1000;

    @Override
    public int importeConDescuentoPara(Producto unProducto) {
        return unProducto.getPrecioDeLista() - monto;
    }
}
