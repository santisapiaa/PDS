package Clase3.SuscripcionesStrategy.refactor.planesDeEnvio;

import Clase3.SuscripcionesStrategy.refactor.producto.Producto;

public class Premium implements IPlanDeEnvio {
    
    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return 0; 
    }
}
