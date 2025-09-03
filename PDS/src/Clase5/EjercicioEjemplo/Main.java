package Clase5.EjercicioEjemplo;

import Clase5.EjercicioEjemplo.vendedores.VendedorIndividual;

public class Main {
    public static void main(String[] args) {

        VendedorIndividual matias = new VendedorIndividual("VI1");
        VendedorIndividual melina = new VendedorIndividual("VI2");
        VendedorIndividual juli = new VendedorIndividual("VI3");

        matias.setFacturacion(1001);
        melina.setFacturacion(1000);
        juli.setFacturacion(100);

        Empresa companyCompany = new Empresa();
        companyCompany.sumarVendedor(matias);
        companyCompany.sumarVendedor(melina);
        companyCompany.sumarVendedor(juli);

        System.out.println("Cuanto factura: " + companyCompany.facturacionTotal());
    }
}