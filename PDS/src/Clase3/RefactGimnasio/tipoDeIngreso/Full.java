package Clase3.RefactGimnasio.tipoDeIngreso;

import Clase3.RefactGimnasio.actividad.Actividad;

public class Full implements ITipoDeIngreso{

    @Override
    public boolean puedeRealizar(Actividad actividad) {
        return true;
    }
}
