package Practicas.AlumnosBuilder;

public class Main {
    public static void main(String[] args) {

        Universidad uade = new Universidad();

        Carrera tecSoft = new Carrera(001);
        Carrera ingSist = new Carrera(002);

        Materia sistInfo = new Materia("M1", "Sistemas de Informacion");
        Materia prograObjetos = new Materia("M2", "POO1");
        Materia redesDatos = new Materia("M3", "Redes de Datos");
        Materia ingSoftware = new Materia("M4", "Ingenieria de Software");

        Alumno a1 = new AlumnoBuilder()
                .nombre("Santiago")
                .apellido("Sapia")
                .dni("46293510")
                .legajo(1193229)
                .carrera(tecSoft)
                .build();

        Alumno a2 = new AlumnoBuilder()
                .nombre("Alejo")
                .apellido("Taccone")
                .dni("45290123")
                .legajo(1110001)
                .carrera(tecSoft)
                .build();

        Alumno a3 = new AlumnoBuilder()
                .nombre("Mateo")
                .apellido("Magallanes")
                .dni("11000123")
                .legajo(0001110)
                .genero("Señorita")
                .carrera(ingSist)
                .build();

        Alumno a4 = new AlumnoBuilder()
                .nombre("Enzo")
                .apellido("Mussi")
                .dni("0002324")
                .legajo(1234578)
                .genero("Mujer")
                .nacionalidad("Bolita")
                .carrera(ingSist)
                .build();

        uade.agregarAlumno(a1);
        uade.agregarAlumno(a2);
        uade.agregarAlumno(a3);
        uade.agregarAlumno(a4);

        uade.agregarCarrera(tecSoft);
        uade.agregarCarrera(ingSist);

        tecSoft.agregarMateria(sistInfo);
        tecSoft.agregarMateria(prograObjetos);
        tecSoft.agregarMateria(redesDatos);
        tecSoft.agregarMateria(ingSoftware);
        ingSist.agregarMateria(sistInfo);
        ingSist.agregarMateria(prograObjetos);
        ingSist.agregarMateria(redesDatos);
        ingSist.agregarMateria(ingSoftware);

        System.out.println(a1);
        System.out.println(a3);
    }
}
