package Clase4.SalonesBuilder;

import Clase4.SalonesBuilder.componentes.catering.Catering;
import Clase4.SalonesBuilder.componentes.escenario.Escenario;
import Clase4.SalonesBuilder.componentes.mobiliarios.Mobiliario;
import Clase4.SalonesBuilder.componentes.musicalizacion.Musicalizacion;
import Clase4.SalonesBuilder.componentes.sistemasDeAcceso.SistemaDeAcceso;

public class SalonBuilder {
    private String id;
    private Musicalizacion musicalizacion;
    private Catering catering;
    private Mobiliario mobiliario;
    private Escenario escenario;
    private SistemaDeAcceso sistemaDeAcceso;

    public SalonBuilder id(String id){
        this.id = id;
        return this;
    }

    public SalonBuilder musicalizacion(Musicalizacion musicalizacion){
        this.musicalizacion = musicalizacion;
        return this;
    }

    public SalonBuilder catering(Catering catering){
        this.catering = catering;
        return this;
    }

    public SalonBuilder mobiliario(Mobiliario mobiliario){
        this.mobiliario = mobiliario;
        return this;
    }

    public SalonBuilder escenario(Escenario escenario){
        this.escenario = escenario;
        return this;
    }

    public SalonBuilder sistemaDeAcceso(SistemaDeAcceso sistemaDeAcceso){
        this.sistemaDeAcceso = sistemaDeAcceso;
        return this;
    }

    public Salon build(){
        return new Salon(
            this.id, 
            this.musicalizacion, 
            this.catering, 
            this.mobiliario, 
            this.escenario, 
            this.sistemaDeAcceso);
    }
}
