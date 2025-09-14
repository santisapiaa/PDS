package Clase3.ProductosDescuentoStrategy.tiposDescuento;

import Clase3.ProductosDescuentoStrategy.producto.Producto;

public class Porcentaje implements IDescuento {
    
    private final int porcentaje = 10;

    @Override
    public int importeConDescuentoPara(Producto unProducto) {
        return unProducto.getPrecioDeLista() - (unProducto.getPrecioDeLista() * porcentaje / 100);
    }
}
