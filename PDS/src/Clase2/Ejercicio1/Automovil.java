package Clase2.Ejercicio1;


public class Automovil implements IMotorizado, IAmbientable{
    private int cantPuertas;
    private int velocidadMaxima;
    private String color;
    private int autonomia;

    public Automovil(int cantPuertas, int velocidadMaxima, String color, int autonomia) {
        this.cantPuertas = cantPuertas;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.autonomia = autonomia;
    }

    public void cuantaNaftaConsumiste(int kms) {
        int consumo = kms / 15; // Example consumption rate
        System.out.println("El automóvil consume " + consumo + " litros de combustible por " + kms + " kms.");
    }

    public void bloquearPuertas() {
        System.out.println("Las puertas del avión están bloqueadas.");
    }

    public boolean encenderLuces() {
        System.out.println("Las luces del avión están encendidas.");
        return true; // Assume lights can always be turned on
    }
}
