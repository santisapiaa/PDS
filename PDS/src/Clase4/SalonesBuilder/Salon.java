package Clase4.SalonesBuilder;

import Clase4.SalonesBuilder.componentes.catering.Catering;
import Clase4.SalonesBuilder.componentes.escenario.Escenario;
import Clase4.SalonesBuilder.componentes.mobiliarios.Mobiliario;
import Clase4.SalonesBuilder.componentes.musicalizacion.Musicalizacion;
import Clase4.SalonesBuilder.componentes.sistemasDeAcceso.SistemaDeAcceso;

public class Salon {
    private final String id;
    private final Musicalizacion musicalizacion;
    private final Catering catering;
    private final Mobiliario mobiliario;
    private final Escenario escenario;
    private final SistemaDeAcceso sistemaDeAcceso;

    /*
        Unico constructor "gigante"
     */
    public Salon(String id,
                 Musicalizacion musicalizacion,
                 Catering catering,
                 Mobiliario mobiliario,
                 Escenario escenario,
                 SistemaDeAcceso sistemaDeAcceso
    ) {
        this.id = id;
        this.musicalizacion = musicalizacion;
        this.catering = catering;
        this.mobiliario = mobiliario;
        this.escenario = escenario;
        this.sistemaDeAcceso = sistemaDeAcceso;
    }
}
