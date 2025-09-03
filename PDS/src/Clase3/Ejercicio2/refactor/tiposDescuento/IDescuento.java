package Clase3.Ejercicio2.refactor.tiposDescuento;

import Clase3.Ejercicio2.refactor.producto.Producto;

public interface IDescuento {
    public int importeConDescuentoPara(Producto unProducto);
}
