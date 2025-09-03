package Clase4.Ejercicio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Universidad uade = new Universidad();

        Carrera tecSoftware = new Carrera(001);
        Carrera licSoftware = new Carrera(002);

        Materia m1 = new Materia(001, "Programacion");
        Materia m2 = new Materia(002, "Base de Datos");
        Materia m3 = new Materia(003, "Algebra");
        Materia m4 = new Materia(004, "Matematica Discreta");
        Materia m5 = new Materia(005, "Sistemas de Informacion");

        Alumno a1 = new Alumno("Enzo", "Mussi", 46635325, 141822, tecSoftware);
        Alumno a2 = new Alumno("Alejo", "Taccone", 12346322, 000000, licSoftware);
        Alumno a3 = new Alumno("Mateo", "Magallanes", 44335510, 998541, tecSoftware);
        Alumno a4 = new Alumno("Santiago", "Sapia", 46293510, 1193229, licSoftware);

        Alumno a5 = new AlumnoBuilder()
            .nombre("Alejo")
            .apellido("Taccone")
            .dni(12346322)
            .legajo(000000)
            .carrera(tecSoftware)
            .build();

        uade.agregarAlumno(a1);
        uade.agregarAlumno(a2);
        uade.agregarAlumno(a3);
        uade.agregarAlumno(a4);

        uade.agregarCarrera(tecSoftware);
        uade.agregarCarrera(licSoftware);

        tecSoftware.agregarMateria(m1);
        tecSoftware.agregarMateria(m2);
        tecSoftware.agregarMateria(m5);
        licSoftware.agregarMateria(m1);
        licSoftware.agregarMateria(m2);
        licSoftware.agregarMateria(m3);
        licSoftware.agregarMateria(m4);
        licSoftware.agregarMateria(m5);

        System.out.println(a5);
    }
}
