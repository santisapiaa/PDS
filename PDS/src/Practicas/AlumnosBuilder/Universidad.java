package Practicas.AlumnosBuilder;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private List<Alumno> alumnos = new ArrayList<>();
    private List<Carrera> carreras = new ArrayList<>();

    public void agregarAlumno(Alumno a) {
        this.alumnos.add(a);
    }

    public void eliminarAlumno(Alumno a){
        this.alumnos.remove(a);
    }

    public void agregarCarrera(Carrera c) {
        this.carreras.add(c);
    }

    public void eliminarCarrera(Carrera c){
        this.carreras.remove(c);
    }
}
