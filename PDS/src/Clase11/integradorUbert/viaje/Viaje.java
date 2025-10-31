package Clase11.integradorUbert.viaje;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.utils.TipoVehiculo;

public interface Viaje {

    void asignarConductor(Conductor unConductor);

    void finalizarViaje();

    String getId();

    int getDistancia();

    EstadoDeViaje estadoDeViaje();

    Conductor getConductor();

    Pasajero getPasajero();

    TipoVehiculo getTipoRequerido();
}