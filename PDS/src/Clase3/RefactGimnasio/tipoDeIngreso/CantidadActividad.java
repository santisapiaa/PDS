package Clase3.RefactGimnasio.tipoDeIngreso;

import Clase3.RefactGimnasio.actividad.Actividad;

public class CantidadActividad implements ITipoDeIngreso {

    int cantRestante = 2;

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
