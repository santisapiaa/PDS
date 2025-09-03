package Clase1.Gimnasio;

public abstract class Membresia {
    private int idMembresia;
    private int DNI;

    public Membresia(int idMembresia, int DNI) {
        this.idMembresia = idMembresia;
        this.DNI = DNI;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public abstract boolean puedeRealizar(Actividad actividad);
}
