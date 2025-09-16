package Practicas.AlumnosBuilder;

public class Alumno {

    private String nombre;
    private String apellido;
    private String dni;
    private int legajo;
    private String genero;
    private String nacionalidad;
    private Carrera carrera;

    public Alumno(String nombre, String apellido, String dni, int legajo, Carrera carrera) {
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
        return "--- DATOS DEL ALUMNO ---" +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDNI: " + dni +
                "\nLegajo: " + legajo +
                "\nGenero: " + genero +
                "\nNacionalidad: " + nacionalidad +
                "\n\n--- CARRERA ---" +
                "\n" + carrera;
    }
}
