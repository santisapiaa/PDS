package Clase3.SuscripcionesStrategy.refactor.planesDeEnvio;

import Clase3.SuscripcionesStrategy.refactor.producto.Producto;

public interface IPlanDeEnvio {

    int costoDeEnvioPara(Producto unProducto);
    
}
