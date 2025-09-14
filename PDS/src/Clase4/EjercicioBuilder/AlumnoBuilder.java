package Clase4.EjercicioBuilder;

public class AlumnoBuilder {
    private String nombre;
    private String apellido;
    private int dni;
    private int legajo;
    private String genero;
    private String nacionalidad;
    private Carrera carrera;

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public AlumnoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public AlumnoBuilder apellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public AlumnoBuilder dni(int dni){
        this.dni = dni;
        return this;
    }

    public AlumnoBuilder legajo(int legajo){
        this.legajo = legajo;
        return this;
    }

    public AlumnoBuilder carrera(Carrera carrera){
        this.carrera = carrera;
        return this;
    }

    public AlumnoBuilder genero(String genero){
        this.genero = genero;
        return this;
    }

    public AlumnoBuilder nacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
        return this;
    }

    public Alumno build(){
        return new Alumno(
            this.nombre, 
            this.apellido, 
            this.dni, 
            this.legajo, 
            this.carrera);
    }
}
