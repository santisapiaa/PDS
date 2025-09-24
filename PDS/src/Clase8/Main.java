package Clase8;

import Clase8.documentos.DocumentoDeTexto;

public class Main {
    public static void main(String[] args) {

        // Documento
        DocumentoDeTexto doc01 = new DocumentoDeTexto("Doc01",3);
        DocumentoDeTexto doc02 = new DocumentoDeTexto("Doc02",5);


        // Impresora solamente
        System.out.println(">>>Impresora");

        System.out.println(doc01);
        System.out.printf("-----------------%n");

        System.out.println(doc02);
        System.out.printf("-----------------%n");
    }
}
