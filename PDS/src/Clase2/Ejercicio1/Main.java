package Clase2.Ejercicio1;

public class Main{
    public static void main(String[] args) {
        Golondrina g = new Golondrina(10, 1, 2);
        g.vola(200);
        g.come();
        g.vola(50);

        Avion a = new Avion(100, 5000, 10);
        a.vola(1000);
    }
}
