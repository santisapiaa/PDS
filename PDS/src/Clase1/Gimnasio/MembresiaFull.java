package Clase1.Gimnasio;

public class MembresiaFull extends Membresia{
    public MembresiaFull(int idMembresia, int DNI) {
        super(idMembresia, DNI);
    }

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        return true;
    }
}
