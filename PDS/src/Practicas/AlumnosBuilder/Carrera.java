package Practicas.AlumnosBuilder;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private int id;
    private List<Materia> materias = new ArrayList<>();

    public Carrera(int id) {
        this.id = id;
    }

    public void agregarMateria(Materia m) {
        this.materias.add(m);
    }

    public void eliminarMateria(Materia m){
        this.materias.remove(m);
    }

    @Override
    public String toString() {
        String materiasString = "";
        for (Materia materia : materias) {
            materiasString += materia.toString() + "\n";
        }
        return "ID de Carrera: " + id + "\n" +
                "Materias:\n" +
                materiasString;
    }

}
