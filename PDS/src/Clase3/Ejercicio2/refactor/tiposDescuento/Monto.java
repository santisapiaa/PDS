package Clase3.Ejercicio2.refactor.tiposDescuento;

import Clase3.Ejercicio2.refactor.producto.Producto;

public class Monto implements IDescuento {
    private final int monto = 1000;

    @Override
    public int importeConDescuentoPara(Producto unProducto) {
        return unProducto.getPrecioDeLista() - monto;
    }
}
