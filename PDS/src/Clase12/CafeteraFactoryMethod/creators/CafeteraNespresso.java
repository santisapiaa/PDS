package Clase12.CafeteraFactoryMethod.creators;

import Clase12.CafeteraFactoryMethod.productos.Cafe;
import Clase12.CafeteraFactoryMethod.productos.CafeDeCapsula;

public class CafeteraNespresso implements CafeCreator{

    @Override
    public Cafe preparar() {
        return new CafeDeCapsula();
    }
}
