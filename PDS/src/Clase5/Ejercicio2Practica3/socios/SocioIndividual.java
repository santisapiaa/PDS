package Clase5.Ejercicio2Practica3.socios;

import java.util.ArrayList;
import java.util.List;

public class SocioIndividual implements ISocio{

    private String nombre;
    private String nivel;
    private int puntos;
    private List<ISocio> sociosReferidos;

    public SocioIndividual(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntos = 0;
        this.sociosReferidos = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getNivel() {
        return nivel;
    }

    @Override
    public int getPuntos() {
        return puntos;
    }

    public void referirNuevoSocio(ISocio nuevSocio){
        sociosReferidos.add(nuevSocio);
    }

    @Override
    public void getSociosReferidos() {
        for (ISocio socio : sociosReferidos) {
            System.out.println(socio);
        }
    }

    @Override
    public void recibirPremio(int puntos) {
        if (sociosReferidos.isEmpty()) {
            this.puntos += puntos;
        } else {
            int mitad = puntos / 2;
            this.puntos += puntos - mitad; // se queda con la otra mitad
            int porReferido = mitad / sociosReferidos.size();
            for (ISocio r : sociosReferidos) {
                r.recibirPremio(porReferido);
            }
        }
    }
}
