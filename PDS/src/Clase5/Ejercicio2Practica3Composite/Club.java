package Clase5.Ejercicio2Practica3Composite;

import java.util.ArrayList;
import java.util.List;

import Clase5.Ejercicio2Practica3Composite.socios.ISocio;

public class Club {
    private List<ISocio> fundadores;

    public Club() {
        this.fundadores = new ArrayList<>();
    }

    public void agregarFundador(ISocio socio) {
        fundadores.add(socio);
    }

    public int contarSocios() {
        int total = 0;
        for (ISocio f : fundadores) {
            total += f.contarSocios();
        }
        return total;
    }

    public void mostrarInfo() {
        for (ISocio f : fundadores) {
            mostrarSocio(f, "");
        }
    }

    private void mostrarSocio(ISocio socio, String prefijo) {
        System.out.println(prefijo + socio.getNombre() + " (Nivel " + socio.getNivel() + ") - Puntos: " + socio.getPuntos());
        for (ISocio r : socio.getReferidos()) {
            mostrarSocio(r, prefijo + "   ");
        }
    }
}
