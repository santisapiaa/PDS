package Clase5.EjercicioEjemplo;

import Clase5.EjercicioEjemplo.vendedores.EquipoDeVendedores;
import Clase5.EjercicioEjemplo.vendedores.VendedorIndividual;

public class Main {
    public static void main(String[] args) {

        VendedorIndividual matias = new VendedorIndividual("VI1");
        VendedorIndividual melina = new VendedorIndividual("VI2");
        VendedorIndividual juli = new VendedorIndividual("VI3");

        matias.setFacturacion(1001);
        melina.setFacturacion(1000);
        juli.setFacturacion(100);

        EquipoDeVendedores t665 = new EquipoDeVendedores();

        VendedorIndividual tomas = new VendedorIndividual("VT1");
        tomas.setFacturacion(3000);

        VendedorIndividual melanie = new VendedorIndividual("VT2");
        melanie.setFacturacion(6000);

        t665.agregar(tomas);
        t665.agregar(melanie);

        Empresa companyCompany = new Empresa();
        companyCompany.sumarVendedor(matias);
        companyCompany.sumarVendedor(melina);
        companyCompany.sumarVendedor(juli);
        companyCompany.sumarVendedor(t665);

        companyCompany.repartirRegalias(1000);

        System.out.println("Cuanto factura: " + companyCompany.facturacionTotal());

        System.out.println(tomas);
        System.out.println(melanie);

    }
}