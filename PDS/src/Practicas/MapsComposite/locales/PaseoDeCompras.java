package Practicas.MapsComposite.locales;

import java.util.ArrayList;
import java.util.List;

public class PaseoDeCompras implements IMarcador {

    private String nombre;
    int estrellas;
    double latitud;
    double longitud;
    private List<IMarcador> locales;

    public PaseoDeCompras(String nombre, int estrellas, double latitud, double longitud) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.latitud = latitud;
        this.longitud = longitud;
        this.locales = new ArrayList<>();
    }

    public void agregarLocal(IMarcador local){
        locales.add(local);
    }

    @Override
    public String getDescripcion() {
        String descripcion = "Paseo de Compras: " + nombre + " (" + estrellas + " estrellas)\n";
        for (IMarcador local : locales) {
            descripcion += "  - " + local.getDescripcion() + "\n";
        }
        return descripcion;
    }

    @Override
    public double getLatitud() {
        return latitud;
    }

    @Override
    public double getLongitud() {
        return longitud;
    }
}
