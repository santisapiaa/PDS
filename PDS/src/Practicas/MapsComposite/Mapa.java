package Practicas.MapsComposite;

import Practicas.MapsComposite.locales.IMarcador;

import java.util.HashSet;

public class Mapa {

    private HashSet<IMarcador> marcadores;

    public Mapa() {
        this.marcadores = new HashSet<>();
    }

    public void agregarMarcador(IMarcador m) {
        marcadores.add(m);
    }

    public void mostrarMarcadores(){
        for (IMarcador m : marcadores) {
            System.out.println(m.getDescripcion());
        }
    }
}
