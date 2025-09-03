package Clase3.Ejercicio2.refactor.tiposDescuento;

import Clase3.Ejercicio2.refactor.producto.Producto;

public class Porcentaje implements IDescuento {
    
    private final int porcentaje = 10;

    @Override
    public int importeConDescuentoPara(Producto unProducto) {
        return unProducto.getPrecioDeLista() - (unProducto.getPrecioDeLista() * porcentaje / 100);
    }
}
