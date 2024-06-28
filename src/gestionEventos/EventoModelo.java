package gestionEventos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventoModelo {

    private Connection connection;

    public EventoModelo(Connection connection) {
        this.connection = connection;
    }

    public void agregarEvento(Evento evento) {
        String consultaSQL = "INSERT INTO eventos (codigo_evento, titulo, descripcion_corta, descripcion_extensa, fecha, imagen, codigo_estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement sentencia = connection.prepareStatement(consultaSQL)) {
            sentencia.setInt(1, evento.getCodigoEvento());
            sentencia.setString(2, evento.getTitulo());
            sentencia.setString(3, evento.getDescripcionCorta());
            sentencia.setString(4, evento.getDescripcionExtensa());
            sentencia.setDate(5, new Date(evento.getFecha().getTime()));
            sentencia.setString(6, evento.getImagen());
            sentencia.setInt(7, evento.getEstado().valor);
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar el evento: " + e.getMessage());
        }
    }

    public void eliminarEvento(int codigoEvento) {
        String consultaSQL = "DELETE FROM eventos WHERE codigo_evento = ?";
        try (PreparedStatement sentencia = connection.prepareStatement(consultaSQL)) {
            sentencia.setInt(1, codigoEvento);
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar el evento: " + e.getMessage());
        }
    }

    public List<Evento> listarEventos() {
        String consultaSQL = "SELECT * FROM eventos";
        List<Evento> eventos = new ArrayList<Evento>();
        try (PreparedStatement sentencia = connection.prepareStatement(consultaSQL)) {
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                int codigoEvento = resultado.getInt("codigo_evento");
                String titulo = resultado.getString("titulo");
                String descripcionCorta = resultado.getString("descripcion_corta");
                String descripcionExtensa = resultado.getString("descripcion_extensa");
                Date fecha = resultado.getDate("fecha");
                String imagen = resultado.getString("imagen");
                int codigoEstado = resultado.getInt("codigo_estado");
                EstadosEvento estado = EstadosEvento.BORRADOR;
                switch (codigoEstado) {
                    case 1:
                        estado = EstadosEvento.BORRADOR;
                        break;
                    case 2:
                        estado = EstadosEvento.CONFIRMADO;
                        break;
                    case 3:
                        estado = EstadosEvento.CANCELADO;
                        break;
                }
                List<Inscripto> inscriptos = new ArrayList<>();
                Evento evento = new Evento(codigoEvento, titulo, descripcionCorta, descripcionExtensa, fecha, imagen,
                        estado, inscriptos);
                eventos.add(evento);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar los eventos: " + e.getMessage());
        }
        return eventos;
    }
}
