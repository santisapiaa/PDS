package Clase5.EjercicioStateCafe.sinState;

public class MaquinaCafe {

    private int cantidadAzucarSeleccionada = 3;
    private int contadorCafes = 0;
    private int contadorCortados = 0;

    private boolean estaPago = false;

    private String mensaje = "Acerque su tarjeta";

    public String indicacionDisplay() {
        return mensaje;
    }

    public void btnMasAzucar() {
        cantidadAzucarSeleccionada = cantidadAzucarSeleccionada < 5
                ? cantidadAzucarSeleccionada + 1
                : cantidadAzucarSeleccionada;

    }

    public void btnMenosAzucar() {
        cantidadAzucarSeleccionada = cantidadAzucarSeleccionada > 0
                ? cantidadAzucarSeleccionada - 1
                : cantidadAzucarSeleccionada;
    }

    public int getCantidadAzucarSeleccionada() {
        return cantidadAzucarSeleccionada;
    }

    public void acercarTarjetaCredito() {
        estaPago = true;
        mensaje = "Seleccione su cafe";
    }

    public void btnCafeSolo() {
        if (estaPago) {
            // preparar cafe solo
            contadorCafes = contadorCafes + 1;
            estaPago = false;
            mensaje = "Acerque su tarjeta";
        }
    }

    public void btnCafeCortado() {

        if (estaPago) {
            // preparar cafe cortado
            contadorCortados = contadorCortados + 1;
            estaPago = false;
            mensaje = "Acerque su tarjeta";
        }
    }


}
