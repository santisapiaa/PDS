package Clase4.SalonesBuilder.componentes.sistemasDeAcceso;

public interface SistemaDeAcceso {

    void agregarAsistente(Asistente unAsistente);
    void eliminarAsistente(Asistente unAsistente);
    void registrarIngreso(Asistente unAsistente);
    void registrarEgreso(Asistente unAsistente);
    int cantidadAsistenesDentro();
    int cantidadAsistentesFalantes(Asistente unAsistente);

}
