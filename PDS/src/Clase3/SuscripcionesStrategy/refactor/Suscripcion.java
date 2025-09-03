package Clase3.SuscripcionesStrategy.refactor;

import Clase3.SuscripcionesStrategy.refactor.planesDeEnvio.IPlanDeEnvio;
import Clase3.SuscripcionesStrategy.refactor.producto.Producto;

public class Suscripcion {
    private String username;
    private IPlanDeEnvio plan;

    public Suscripcion(String username, IPlanDeEnvio plan) {
        this.username = username;
        this.plan = plan;
    }

    public void setPlan(IPlanDeEnvio plan) {
        this.plan = plan;
    }

    public int costoDeEnvioPara(Producto unProducto) {
        return plan.costoDeEnvioPara(unProducto);
    }

    //public agregarFavorito (Producto unProducto) {
    //    this.gestorFavoritos.agregar(unProducto);
    //}
}
