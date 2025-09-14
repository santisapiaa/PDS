package Clase3.GimnasioStrategy.tipoDeIngreso;

import Clase3.GimnasioStrategy.actividad.Actividad;

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
