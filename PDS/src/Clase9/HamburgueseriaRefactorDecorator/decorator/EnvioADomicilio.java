package Clase9.HamburgueseriaRefactorDecorator.decorator;

public class EnvioADomicilio extends ProductoFacturableDecorator {

    private static final double RECARGO_ENVIO = 0.05;

    public EnvioADomicilio(ProductoFacturable productoDecorado) {
        super(productoDecorado);
    }

    @Override
    public double getPrecioFinal() {
        // Obtiene el precio (base o ya decorado)
        double precioBase = super.productoDecorado.getPrecioFinal();

        // Aplica el 5% de incremento
        double precioConEnvio = precioBase * (1.0 + RECARGO_ENVIO);

        System.out.printf("  + Recargo por Envío a Domicilio (5%%): %.2f%n", (precioConEnvio - precioBase));

        return precioConEnvio;
    }
}