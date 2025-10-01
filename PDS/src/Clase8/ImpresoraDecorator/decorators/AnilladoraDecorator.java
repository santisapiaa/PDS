package Clase8.ImpresoraDecorator.decorators;

import Clase8.ImpresoraDecorator.ProcesadorDeDocumento;
import Clase8.ImpresoraDecorator.documentos.Documento;

public class AnilladoraDecorator extends BaseDecorator{

    public AnilladoraDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        super(procesadorDeDocumento);
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        Documento unDocumentoYaProcesado = super.procesar(unDocumento); // lo que hace BaseDecorator
        System.out.printf("Anillando documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumentoYaProcesado.abrochar();
        return unDocumentoYaProcesado;
    }
}


