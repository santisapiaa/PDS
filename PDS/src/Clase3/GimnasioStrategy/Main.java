package Clase3.GimnasioStrategy;

import Clase3.GimnasioStrategy.actividad.Actividad;
import Clase3.GimnasioStrategy.tipoDeIngreso.CantidadActividad;
import Clase3.GimnasioStrategy.tipoDeIngreso.Full;
import Clase3.GimnasioStrategy.tipoDeIngreso.Prueba;
import Clase3.GimnasioStrategy.tipoDeIngreso.TipoActividad;

public class Main {
    public static void main(String[] args) {
        Actividad act1 = new Actividad("Media Maraton", "cardio", "Lunes a viernes 17hs");
        Actividad act2 = new Actividad("Aqua Gym", "pileta", "Martes a Sabados 10hs");
        Actividad act4 = new Actividad("Bici Fija", "cardio", "Lunes a viernes 16hs");

        Membresia m1 = new Membresia(001, new Full());

        System.out.println("m1"+m1.puedeRealizar(act1));

        m1.setTipoDeIngreso(new TipoActividad().setActElegida("cardio"));
        
        System.out.println("m2"+m1.puedeRealizar(act4));
        System.out.println("m2"+m1.puedeRealizar(act2));

        m1.setTipoDeIngreso(new CantidadActividad());

        for (int i = 0; i < 5 ; i++) {
            System.out.println("m3"+m1.puedeRealizar(act1));
        }

        m1.setTipoDeIngreso(new Prueba());
        
        System.out.println("m4"+m1.puedeRealizar(act1));
        System.out.println("m4"+m1.puedeRealizar(act1));
    }
}
