package Clase4.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private int id;
    private List<Materia> materias = new ArrayList<>();

    public Carrera(int id) {
        this.id = id;
    }

    public void agregarMateria(Materia m){
        materias.add(m);
    }

    public void eliminarMateria(Materia m){
        materias.remove(m);
    }

    @Override
    public String toString() {
        return "Carrera [id=" + id + ", materias=" + materias + "]";
    }
}
