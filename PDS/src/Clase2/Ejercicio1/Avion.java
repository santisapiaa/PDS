package Clase2.Ejercicio1;

public class Avion implements IVolador, IMotorizado, IAmbientable {
    private int energia;
    private int peso;
    private int cantidadPasajeros;
    private static final int MAX_PASAJEROS = 180; // Example maximum capacity

    public Avion(int energia, int peso, int cantidadPasajeros) {
        this.energia = energia;
        this.peso = peso;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    public void vola(int kms) {
        if (energia > 0) {
            energia -= kms / 5; // Reduce energy based on distance flown
            System.out.println("El avión ha volado " + kms + " kms.");
        } else {
            System.out.println("El avión no tiene suficiente energía para volar.");
        }
    }

    public void cuantaNaftaConsumiste(int kms) {
        int consumo = kms / 5; // Example consumption rate
        System.out.println("El avión consume " + consumo + " litros de combustible por " + kms + " kms.");
    }

    public void bloquearPuertas() {
        if (cantidadPasajeros < MAX_PASAJEROS) {
            System.out.println("El avion se esta llenando, no se pueden bloquear las puertas.");
        } else {
            System.out.println("El avión está lleno, se pueden bloquear las puertas.");
            
        }
    }

    public boolean encenderLuces() {
        System.out.println("Las luces del avión están encendidas.");
        return true; // Assume lights can always be turned on
    }
}
