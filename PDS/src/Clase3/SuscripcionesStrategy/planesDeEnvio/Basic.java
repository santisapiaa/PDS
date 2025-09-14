package Clase3.SuscripcionesStrategy.planesDeEnvio;

import Clase3.SuscripcionesStrategy.producto.Producto;

public class Basic implements IPlanDeEnvio {

    private static int MINIMO_ENVIO_GRATIS = 100000;
    private static int PRECIO_ENVIO = 6000;

    @Override
    public int costoDeEnvioPara(Producto unProducto) {

//        if (unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS) {
//            return 0;
//        } else {
//            return PRECIO_ENVIO;
//        }

        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0                 // if
                : PRECIO_ENVIO;     //else
    }
    
}
