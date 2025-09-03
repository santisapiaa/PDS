package Clase3.SuscripcionesStrategy.refactor.planesDeEnvio;

import Clase3.SuscripcionesStrategy.refactor.producto.Producto;

public class Plus implements IPlanDeEnvio {

    private static int MINIMO_ENVIO_GRATIS = 50000;
    private static int PORCENTAJE_PRECIO_PRODUCTO = 2;

    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0
                : PORCENTAJE_PRECIO_PRODUCTO * unProducto.getPrecio() / 100;
    }
    
}
