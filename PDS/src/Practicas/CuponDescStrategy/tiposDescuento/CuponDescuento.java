package Practicas.CuponDescStrategy.tiposDescuento;

import Practicas.CuponDescStrategy.producto.Producto;

public class CuponDescuento {

    private final String id;
    private final IDescuento tipoDescuento;

    public CuponDescuento(String id, IDescuento tipoDescuento) {
        this.id = id;
        this.tipoDescuento = tipoDescuento;
    }

    public int importeConDescuentoPara(Producto unProducto) {
        return tipoDescuento.aplicarDescuento(unProducto);
    }
}
