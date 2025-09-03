package Clase3.RefactGimnasio.tipoDeIngreso;

import Clase3.RefactGimnasio.actividad.Actividad;

public class Prueba implements ITipoDeIngreso{
    boolean usada = false;

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        if (!usada) {
            usada = true;
            return true;
        }
        return false;
    }
}
