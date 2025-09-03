package Clase5.EjercicioEjemploComposite.vendedores;

public class VendedorIndividual implements IVendedor{

    private String id;
    private float facturacion;
    private float ganancia;

    public VendedorIndividual(String id) {
        this.id = id;
    }

    public void setFacturacion(float facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public float cuandoFacturas() {
        return facturacion;
    }

    @Override
    public float cuantoGanas() {
        return ganancia;
    }

    @Override
    public void recibirComision(float unImporte) {
        ganancia = ganancia + unImporte;
    }
    
}
