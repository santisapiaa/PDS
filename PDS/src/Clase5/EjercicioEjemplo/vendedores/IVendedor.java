package Clase5.EjercicioEjemplo.vendedores;

public interface IVendedor {

    String getId();

    public float cuandoFacturas();

    public float cuantoGanas();

    void recibirComision(float unImporte);

}