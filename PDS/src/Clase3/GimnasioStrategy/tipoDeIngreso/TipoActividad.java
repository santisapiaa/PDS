package Clase3.GimnasioStrategy.tipoDeIngreso;

import Clase3.GimnasioStrategy.actividad.Actividad;

public class TipoActividad implements ITipoDeIngreso{

    String actElegida;

    public TipoActividad setActElegida(String actElegida) {
        this.actElegida = actElegida;
        return this;
    }

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        return actividad.getTipo().equals(actElegida);
    }
}
