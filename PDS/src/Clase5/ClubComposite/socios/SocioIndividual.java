package Clase5.ClubComposite.socios;

import java.util.ArrayList;
import java.util.List;

public class SocioIndividual implements ISocio {

    private String nombre;
    private int nivel;
    private int puntos;
    private List<ISocio> referidos;

    public SocioIndividual(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntos = 0;
        this.referidos = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public int getPuntos() {
        return puntos;
    }

    @Override
    public List<ISocio> getReferidos() {
        return referidos;
    }

    @Override
    public void agregarReferido(ISocio socio) {
        referidos.add(socio);
    }

    @Override
    public void asignarPuntos(int puntos) {
        this.puntos += puntos;
        // repartir mitad a los referidos
        if (!referidos.isEmpty()) {
            int puntosPorSocio = (puntos / 2) / referidos.size();
            for (ISocio r : referidos) {
                r.asignarPuntos(puntosPorSocio);
            }
        }
    }

    @Override
    public int contarSocios() {
        int total = 1; // me cuento a mí mismo
        for (ISocio r : referidos) {
            total += r.contarSocios();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntos=" + puntos +
                ", referidos=" + referidos.size() +
                '}';
    }
}
