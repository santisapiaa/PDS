package Clase1.Gimnasio;

public class MembresiaPrueba extends Membresia{
    boolean usada = false;

    public MembresiaPrueba(int idMembresia, int DNI) {
        super(idMembresia, DNI);
    }

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        if (!usada) {
            usada = true;
            return true;
        }
        return false;
    }
}
