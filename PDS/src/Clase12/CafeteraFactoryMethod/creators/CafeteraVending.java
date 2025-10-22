package Clase12.CafeteraFactoryMethod.creators;

import Clase12.CafeteraFactoryMethod.productos.Cafe;
import Clase12.CafeteraFactoryMethod.productos.CafeViajero;

public class CafeteraVending implements CafeCreator{

    @Override
    public Cafe preparar() {
        return new CafeViajero();
    }
}
