package Clase1.Gimnasio;

public class Main {
    public static void main(String[] args) {
        Actividad act1 = new Actividad("Media Maraton", "cardio", "Lunes a viernes 17hs");
        Actividad act2 = new Actividad("Aqua Gym", "pileta", "Martes a Sabados 10hs");
        Actividad act4 = new Actividad("Bici Fija", "cardio", "Lunes a viernes 16hs");

        Membresia m1 = new MembresiaFull(001, 12345);
        Membresia m2 = new MembresiaTipoAct(002, 00002, "cardio");
        Membresia m3 = new MembresiaCantAct(003, 12121, 3);
        Membresia m4 = new MembresiaPrueba(004, 23872);

        System.out.println("m1"+m1.puedeRealizar(act1));

        System.out.println("m2"+m2.puedeRealizar(act4));
        System.out.println("m2"+m2.puedeRealizar(act2));

        for (int i = 0; i < 5 ; i++) {
            System.out.println("m3"+m3.puedeRealizar(act1));
        }
        
        System.out.println("m4"+m4.puedeRealizar(act1));
        System.out.println("m4"+m4.puedeRealizar(act1));
    }
}