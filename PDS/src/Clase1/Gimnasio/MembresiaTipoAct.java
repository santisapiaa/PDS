package Clase1.Gimnasio;

public class MembresiaTipoAct extends Membresia{
    String tipoElegido;

    public MembresiaTipoAct(int idMembresia, int DNI, String tipoElegido) {
        super(idMembresia, DNI);
        this.tipoElegido = tipoElegido;
    }

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        return actividad.getTipo().equals(tipoElegido);
    }
}
