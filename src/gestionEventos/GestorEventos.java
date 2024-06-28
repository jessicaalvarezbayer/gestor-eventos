package gestionEventos;

import java.util.List;

public class GestorEventos {
    private EventoModelo eventoModelo;

    public GestorEventos(EventoModelo eventoModelo) {
        this.eventoModelo = eventoModelo;
    }

    public void agregarEvento(Evento evento) {
        eventoModelo.agregarEvento(evento);
    }

    public void eliminarEvento(int codigoEvento) {
        eventoModelo.eliminarEvento(codigoEvento);
    }

    public List<Evento> listarEventos() {
        return eventoModelo.listarEventos();
    }

    public void actualizarEvento(Evento evento) {
    }
}
