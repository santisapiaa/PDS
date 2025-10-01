package Clase8.ImpresoraDecorator;

import Clase8.ImpresoraDecorator.documentos.Documento;

public interface ProcesadorDeDocumento {
    Documento procesar(Documento unDocumento);
}
