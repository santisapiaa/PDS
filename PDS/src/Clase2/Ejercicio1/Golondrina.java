package Clase2.Ejercicio1;

public class Golondrina implements IVolador {
    private int energia;
    private int peso;
    private int edad;

    public Golondrina(int energia, int peso, int edad) {
        this.energia = energia;
        this.peso = peso;
        this.edad = edad;
    }
    
    public void vola(int kms) {
        if (energia > 0) {
            energia -= kms / 10; // Reduce energy based on distance flown
            System.out.println("La golondrina ha volado " + kms + " kms.");
        } else {
            System.out.println("La golondrina no tiene suficiente energía para volar.");
        }
    }

    public void come() {
        energia += 5; // Regain energy by eating
        System.out.println("La golondrina ha comido y recuperado energía.");
    }
}
