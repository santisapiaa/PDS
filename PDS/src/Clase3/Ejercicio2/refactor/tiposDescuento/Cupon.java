package Clase3.Ejercicio2.refactor.tiposDescuento;

import Clase3.Ejercicio2.refactor.producto.Producto;

public class Cupon implements IDescuento {
    private final String id;
    private final IDescuento descuento; // 1: por porcentaje 2: por monto
    
    public Cupon(String id, IDescuento descuento) {
        this.id = id;
        this.descuento = descuento;
    }

    public int importeConDescuentoPara(Producto unProducto) {
        return descuento.importeConDescuentoPara(unProducto);
    }
}