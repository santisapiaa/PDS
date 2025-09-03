package Clase5.EjercicioEjemploComposite.vendedores;

import java.util.HashSet;

public class EquipoDeVendedores implements IVendedor{

    private HashSet<IVendedor> integrantes = new HashSet<>();
    private String nombreDelEquipo;

    public void agregar(IVendedor unVendedor) {
        this.integrantes.add(unVendedor);
    }

    public String getId() {
        return nombreDelEquipo;
    }

    @Override
    public float cuandoFacturas() {
        float total = 0;
        for (IVendedor unIntegrante : integrantes) {
            total = total + unIntegrante.cuandoFacturas();
        }
        return total;
    }

    @Override
    public float cuantoGanas() {
        return 0;
    }

    @Override
    public void recibirComision(float unImporte) {
        float cuantoACadaVendedor = unImporte / integrantes.size();
        for (IVendedor unIntegrante : integrantes) {
            unIntegrante.recibirComision(cuantoACadaVendedor);
        }
    }

}