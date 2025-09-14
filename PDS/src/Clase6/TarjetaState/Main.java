package Clase6.TarjetaState;

public class Main {
    public static void main(String[] args) {
        
        Tarjeta tarjeta = new Tarjeta();

        System.out.println(tarjeta);

        tarjeta.recargar(100);
        System.out.println(tarjeta);

        tarjeta.gastar(80);
        System.out.println(tarjeta);

        tarjeta.gastar(50);
        System.out.println(tarjeta);

        tarjeta.gastar(10);
        System.out.println(tarjeta);

        tarjeta.recargar(20);
        System.out.println(tarjeta);

        tarjeta.recargar(50);
        System.out.println(tarjeta);
    }
}
