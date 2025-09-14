package Clase3.ProductosDescuentoStrategy;

import Clase3.ProductosDescuentoStrategy.producto.Producto;
import Clase3.ProductosDescuentoStrategy.tiposDescuento.Cupon;
import Clase3.ProductosDescuentoStrategy.tiposDescuento.Monto;
import Clase3.ProductosDescuentoStrategy.tiposDescuento.Porcentaje;

public class Main {
    public static void main(String[] args) {

        Producto galaxyA15 = new Producto("Celular Samsung GalaxyA15", 1000);
        Producto iPhone16 = new Producto("Celular iPhone 16 Pro", 2000);

        Cupon cupon10off = new Cupon("001", new Porcentaje());
        Cupon cupon1000Ars = new Cupon("002", new Monto());

        System.out.printf(
        "Precio de lista galaxyA15: $%d, con descuento: $%d \n",
            galaxyA15.getPrecioDeLista(),
            cupon10off.importeConDescuentoPara(galaxyA15)
        );

        System.out.printf(
            "Precio de lista iPhone16: $%d, con descuento: $%d \n",
            iPhone16.getPrecioDeLista(),
            cupon1000Ars.importeConDescuentoPara(iPhone16)
        );
    }
}
