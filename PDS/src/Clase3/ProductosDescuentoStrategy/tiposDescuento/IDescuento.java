package Clase3.ProductosDescuentoStrategy.tiposDescuento;

import Clase3.ProductosDescuentoStrategy.producto.Producto;

public interface IDescuento {
    public int importeConDescuentoPara(Producto unProducto);
}
