package Clase8.ImpresoraDecorator.decorators;

import Clase8.ImpresoraDecorator.ProcesadorDeDocumento;
import Clase8.ImpresoraDecorator.documentos.Documento;

public class AbrochadoraDecorator extends BaseDecorator{

    public AbrochadoraDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        super(procesadorDeDocumento);
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        Documento unDocumentoYaimpreso = super.procesar(unDocumento); // lo que hace BaseDecorator
        System.out.printf("Abrochar documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumentoYaimpreso.abrochar();
        return unDocumentoYaimpreso;
    }
}


