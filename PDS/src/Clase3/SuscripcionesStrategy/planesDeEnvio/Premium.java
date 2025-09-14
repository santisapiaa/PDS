package Clase3.SuscripcionesStrategy.planesDeEnvio;

import Clase3.SuscripcionesStrategy.producto.Producto;

public class Premium implements IPlanDeEnvio {
    
    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return 0; 
    }
}
