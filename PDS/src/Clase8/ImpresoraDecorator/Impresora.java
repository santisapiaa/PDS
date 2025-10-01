package Clase8.ImpresoraDecorator;

import Clase8.ImpresoraDecorator.documentos.Documento;

public class Impresora implements ProcesadorDeDocumento{

    public Documento procesar(Documento unDocumento) {
        System.out.printf("Impriendo documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumento.imprimir();
        return unDocumento;
    }

}
