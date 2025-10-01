package Clase9.BancoObserver.observables;

import Clase9.BancoObserver.observadores.Observador;

public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();

}
