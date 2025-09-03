package Clase5.Ejercicio2Practica3;

import java.util.ArrayList;
import java.util.List;

import Clase5.Ejercicio2Practica3.socios.ISocio;;

public class Club {
    
    private List<ISocio> sociosTotales = new ArrayList<>();

    public int getSociosTotales() {
        return sociosTotales.size();
    }

    public void sumarSocio(ISocio nuevoSocio) {
        this.sociosTotales.add(nuevoSocio);
    }

}
