import gestionEventos.EventoModelo;
import gestionEventos.GestorEventos;
import gestionEventos.MenuGestorEventos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/EVENTOS", "root", "Sura2015")) {
            EventoModelo eventoModelo = new EventoModelo(conexion);
            GestorEventos gestorEventos = new GestorEventos(eventoModelo);
            MenuGestorEventos view = new MenuGestorEventos(gestorEventos);
            view.mostrarMenu();
        } catch (SQLException e) {
            System.err.println("Error de conexi�n a la base de datos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
