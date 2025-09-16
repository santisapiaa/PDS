package Practicas.AlumnosBuilder;

public class Materia {

    private String codigo;
    private String nombre;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "  - Codigo: " + codigo + " | Nombre: " + nombre;
    }
}
