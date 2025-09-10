package Clase5.Ejercicio2Practica3Composite.socios;

import java.util.List;

public interface ISocio {

    String getNombre();

    int getNivel();
    
    int getPuntos();
    
    List<ISocio> getReferidos();
    
    void agregarReferido(ISocio socio);
    
    void asignarPuntos(int puntos);
    
    int contarSocios();
}