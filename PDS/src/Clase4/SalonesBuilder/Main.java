package Clase4.SalonesBuilder;

import Clase4.SalonesBuilder.componentes.catering.Catering;
import Clase4.SalonesBuilder.componentes.mobiliarios.MobiliarioDeSillas;
import Clase4.SalonesBuilder.componentes.musicalizacion.Musicalizacion;
import Clase4.SalonesBuilder.componentes.mobiliarios.MobiliarioMesas;
import Clase4.SalonesBuilder.componentes.sistemasDeAcceso.SistemaDeAccesoPlanilla;
import Clase4.SalonesBuilder.componentes.sistemasDeAcceso.SistemaDeAccesoQr;
import Clase4.SalonesBuilder.componentes.sistemasDeAcceso.SistemaDeIngresoPulseras;

public class Main {

    public static void main(String[] args) {

        /*
            Salon para casamientos:
                - Musicalizacion
                - Catering
                - Mobiliario de sillas y mesas
                - Control de acceso por planilla
             Salon para Conferencia:
                 - Moviliario con sillas
                 - Control de acceso con pulseras
             Salon para acreditaciones
                 - Mobiliario de vallas
                 - Sistema de acceso con QR
         */

        Salon salon1 = new SalonBuilder()
                .id("S4324")
                .musicalizacion(new Musicalizacion())
                .catering(new Catering(80))
                .mobiliario(new MobiliarioMesas(10,8))
                .sistemaDeAcceso(new SistemaDeAccesoPlanilla())
                .build();

        Salon salon2 = new SalonBuilder()
                .id("A1234")
                .musicalizacion(new Musicalizacion())
                .catering(new Catering(50))
                .mobiliario(new MobiliarioMesas(5,8))
                .sistemaDeAcceso(new SistemaDeIngresoPulseras())
                .build();
        
        Salon salon3 = new SalonBuilder()
                .id("E5678")
                .musicalizacion(new Musicalizacion())
                .catering(new Catering(60))
                .mobiliario(new MobiliarioDeSillas(60))
                .sistemaDeAcceso(new SistemaDeAccesoQr())
                .build();
        
        System.out.println(salon1);
        System.out.println(salon2);
        System.out.println(salon3);
    }
}
