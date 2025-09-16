package Practicas.MapsComposite;

import Practicas.MapsComposite.locales.Comercio;
import Practicas.MapsComposite.locales.PaseoDeCompras;

public class Main {
    public static void main(String[] args) {
        Comercio comercio1 = new Comercio("Adidas", 35.00001, 22.00001);
        Comercio comercio2 = new Comercio("Nike", 39.00001, 24.00001);
        Comercio comercio3 = new Comercio("Puma", 43.00001, 26.00001);

        PaseoDeCompras paseo1 = new PaseoDeCompras("Devoto Shopping", 4, 47.00001, 28.00001);
        paseo1.agregarLocal(comercio1);
        paseo1.agregarLocal(comercio2);

        Mapa mapa1 = new Mapa();
        mapa1.agregarMarcador(paseo1);
        mapa1.agregarMarcador(comercio3);

        mapa1.mostrarMarcadores();
    }
}
