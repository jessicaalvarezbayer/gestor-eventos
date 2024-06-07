import gestionEventos.GestorEventos;
import gestionEventos.MenuGestorEventos;

public class main {
    public static void main(String[] args) throws Exception {
        GestorEventos gestorEventos = new GestorEventos();
        MenuGestorEventos view = new MenuGestorEventos(gestorEventos);
        view.mostrarMenu();
    }
}
