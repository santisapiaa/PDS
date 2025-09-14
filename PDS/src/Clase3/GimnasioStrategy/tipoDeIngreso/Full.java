package Clase3.GimnasioStrategy.tipoDeIngreso;

import Clase3.GimnasioStrategy.actividad.Actividad;

public class Full implements ITipoDeIngreso{

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        return true;
    }
}
