package Clase8;

import Clase8.documentos.Documento;

public class Impresora {

    public Documento impimir(Documento unDocumento) {
        System.out.printf("Impriendo documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumento.imprimir();
        return unDocumento;
    }

}
