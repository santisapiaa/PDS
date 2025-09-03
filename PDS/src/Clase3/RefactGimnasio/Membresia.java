package Clase3.RefactGimnasio;

import Clase3.RefactGimnasio.actividad.Actividad;
import Clase3.RefactGimnasio.tipoDeIngreso.ITipoDeIngreso;

public class Membresia {
    private int idMembresia;
    private ITipoDeIngreso tipoDeIngreso;

    public Membresia(int idMembresia, ITipoDeIngreso tipoDeIngreso) {
        this.idMembresia = idMembresia;
        this.tipoDeIngreso = tipoDeIngreso;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setTipoDeIngreso(ITipoDeIngreso tipoDeIngreso) {
        this.tipoDeIngreso = tipoDeIngreso;
    }

    public boolean puedeRealizar(Actividad actividad) {
        return tipoDeIngreso.puedeRealizar(actividad);
    }
}