package Practicas.CuponDescStrategy;

import Practicas.CuponDescStrategy.producto.Producto;
import Practicas.CuponDescStrategy.tiposDescuento.CuponDescuento;
import Practicas.CuponDescStrategy.tiposDescuento.DescuentoMonto;
import Practicas.CuponDescStrategy.tiposDescuento.DescuentoPorcentaje;

public class Main {
    public static void main(String[] args) {

                Producto galaxyA15 = new Producto("Celular Samsung GalaxyA15", 4000);
                Producto iPhone16 = new Producto("Celular iPhone 16 Pro", 2400);
                CuponDescuento cupon10off = new CuponDescuento("2d33s", new DescuentoPorcentaje(10));
                CuponDescuento cupon20000Ars = new CuponDescuento("2d33s", new DescuentoMonto(200));

                System.out.printf(
                        "Precio de lista galaxyA15: $%d, con descuento: $%d \n",
                        galaxyA15.getPrecioDeLista(),
                        cupon10off.importeConDescuentoPara(galaxyA15)
                );

                System.out.printf("Precio de lista iPhone16: $%d, con descuento: $%d \n",
                        iPhone16.getPrecioDeLista(),
                        cupon20000Ars.importeConDescuentoPara(iPhone16)
                );
    }
}
