package Clase9.HamburgueseriaRefactorDecorator.decorator;

public class DescuentoEnEfectivo extends ProductoFacturableDecorator {

    // Siguiendo el requisito de "costo fijo que se suma al precio total"
    private static final double COSTO_FIJO_ADICIONAL = 25.0;

    public DescuentoEnEfectivo(ProductoFacturable productoDecorado) {
        super(productoDecorado);
    }

    @Override
    public double getPrecioFinal() {
        // Obtiene el precio (base o ya decorado)
        double precioActual = super.productoDecorado.getPrecioFinal();

        // Suma el costo fijo
        double precioFinal = precioActual + COSTO_FIJO_ADICIONAL;

        System.out.printf("  + Costo Fijo Adicional (por Descuento en Efectivo): %.2f%n", COSTO_FIJO_ADICIONAL);

        return precioFinal;
    }
}