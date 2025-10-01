package Clase8.ImpresoraDecorator.decorators;

import Clase8.ImpresoraDecorator.ProcesadorDeDocumento;
import Clase8.ImpresoraDecorator.documentos.Documento;

public abstract class BaseDecorator implements ProcesadorDeDocumento {

    private final ProcesadorDeDocumento procesadorDeDocumento;

    protected BaseDecorator(ProcesadorDeDocumento unProcesadorDeDocumento) {
        procesadorDeDocumento = unProcesadorDeDocumento;
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        return procesadorDeDocumento.procesar(unDocumento); // lo que hace procesador
    }
}
