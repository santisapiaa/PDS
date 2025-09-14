package Clase4.EjercicioBuilder;

public class Materia {
    private int codigo;
    private String nombre;

    public Materia(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
}
