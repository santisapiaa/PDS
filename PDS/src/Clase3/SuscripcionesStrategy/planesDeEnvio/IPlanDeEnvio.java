package Clase3.SuscripcionesStrategy.planesDeEnvio;

import Clase3.SuscripcionesStrategy.producto.Producto;

public interface IPlanDeEnvio {

    int costoDeEnvioPara(Producto unProducto);
    
}
