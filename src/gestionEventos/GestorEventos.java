package gestionEventos;
import java.util.ArrayList;
import java.util.List;

public class GestorEventos {
    private List<Evento> eventos;

    public GestorEventos() {
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void actualizarEvento(Evento evento) {
    }

    public void eliminarEvento(int codigoEvento) {
        eventos.removeIf(evento -> evento.getCodigoEvento() == codigoEvento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }
}
