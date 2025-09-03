package Clase1.Gimnasio;

public class MembresiaCantAct extends Membresia{
    int cantRestante;

    public MembresiaCantAct(int idMembresia, int DNI, int cantRestante) {
        super(idMembresia, DNI);
        this.cantRestante = cantRestante;
    }

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        boolean re = false;
        if (cantRestante > 0) {
            cantRestante--;
            re = true;
        }
        return re;
    }
}
