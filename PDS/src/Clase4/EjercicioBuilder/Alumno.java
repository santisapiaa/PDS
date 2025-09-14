package Clase4.EjercicioBuilder;

public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private int legajo;
    private String genero;
    private String nacionalidad;
    private Carrera carrera;

    public Alumno(String nombre, String apellido, int dni, int legajo, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.carrera = carrera;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo=" + legajo
                + ", genero=" + genero + ", nacionalidad=" + nacionalidad + ", carrera=" + carrera + "]";
    }
}
