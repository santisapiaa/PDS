package Clase3.SuscripcionesStrategy;

import Clase3.SuscripcionesStrategy.planesDeEnvio.Basic;
import Clase3.SuscripcionesStrategy.planesDeEnvio.Plus;
import Clase3.SuscripcionesStrategy.planesDeEnvio.Premium;
import Clase3.SuscripcionesStrategy.producto.Producto;

public class Main {
    public static void main(String[] args) {
        
        Suscripcion suscripcion1 = new Suscripcion("usuario1", new Basic());

        Producto monitorSamsung = new Producto(120000, "Monitor Samsung 24 pulgadas");
        Producto tecladoRedragon = new Producto(30000, "Teclado Redragon TKL");
        Producto mouseLogitech = new Producto(50000, "Mouse Logitech G502");

        System.out.println("Suscripcion Basica");
        System.out.printf(
            "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcion1.costoDeEnvioPara(monitorSamsung)
        );

        suscripcion1.setPlan(new Plus());
        System.out.println("---------");

        System.out.println("Suscripcion Plus");
        System.out.printf(
            "Precio del producto: $%d, precio envio: $%d \n",
                tecladoRedragon.getPrecio(),
                suscripcion1.costoDeEnvioPara(tecladoRedragon)
        );

        suscripcion1.setPlan(new Premium());
        System.out.println("---------");

        System.out.println("Suscripcion Premium");
        System.out.printf(
            "Precio del producto: $%d, precio envio: $%d \n",
                mouseLogitech.getPrecio(),
                suscripcion1.costoDeEnvioPara(mouseLogitech)
        );
    }
}
