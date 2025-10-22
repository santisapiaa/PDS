package Clase12.CafeteraFactoryMethod.creators;

import Clase12.CafeteraFactoryMethod.productos.Cafe;
import Clase12.CafeteraFactoryMethod.productos.CafeDeFiltro;

public class CafeteraItaliana implements CafeCreator{

    @Override
    public Cafe preparar() {
        return new CafeDeFiltro();
    }
}
