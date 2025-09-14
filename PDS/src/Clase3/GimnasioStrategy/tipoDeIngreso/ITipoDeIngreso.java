package Clase3.GimnasioStrategy.tipoDeIngreso;

import Clase3.GimnasioStrategy.actividad.Actividad;

public interface ITipoDeIngreso {
    public boolean puedeRealizar(Actividad actividad);
}