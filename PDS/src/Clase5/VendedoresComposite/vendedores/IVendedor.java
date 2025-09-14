package Clase5.VendedoresComposite.vendedores;

public interface IVendedor {

    String getId();

    public float cuandoFacturas();

    public float cuantoGanas();

    void recibirComision(float unImporte);

}