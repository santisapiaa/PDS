package Clase5.Ejercicio2Practica3Composite;

import Clase5.Ejercicio2Practica3Composite.socios.SocioIndividual;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        // Fundadores nivel 0
        SocioIndividual s1 = new SocioIndividual("Ana", 0);
        SocioIndividual s2 = new SocioIndividual("Pedro", 0);
        club.agregarFundador(s1);
        club.agregarFundador(s2);

        // Referidos
        SocioIndividual r1 = new SocioIndividual("Juan", 1);
        SocioIndividual r2 = new SocioIndividual("Maria", 1);
        s1.agregarReferido(r1);
        s1.agregarReferido(r2);

        SocioIndividual r3 = new SocioIndividual("Luis", 1);
        s2.agregarReferido(r3);

        // Referidos de referidos
        SocioIndividual rr1 = new SocioIndividual("Sofia", 2);
        r1.agregarReferido(rr1);

        // Asignar puntos
        s1.asignarPuntos(100);

        // Mostrar info
        club.mostrarInfo();
        System.out.println("Total de socios en el club: " + club.contarSocios());
    }
}
