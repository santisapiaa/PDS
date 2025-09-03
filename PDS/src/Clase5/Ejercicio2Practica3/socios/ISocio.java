package Clase5.Ejercicio2Practica3.socios;

public interface ISocio {

    String getNombre();

    String getNivel();

    int getPuntos();

    void getSociosReferidos();

    void referirNuevoSocio(ISocio nuevSocio);

    public void recibirPremio(int puntos);
}
