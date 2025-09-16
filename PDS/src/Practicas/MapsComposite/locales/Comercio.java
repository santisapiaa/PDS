package Practicas.MapsComposite.locales;

public class Comercio implements IMarcador {
    String nombre;
    double latitud;
    double longitud;

    public Comercio(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public String getDescripcion() {
        return "Comercio: " + nombre + " (Latitud: " + latitud + " / Longitud: "+ longitud + ")";
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
