package gestionEventos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MenuGestorEventos {
    private GestorEventos gestorEventos;
    private Scanner scanner;

    public MenuGestorEventos(GestorEventos gestorEventos) {
        this.gestorEventos = gestorEventos;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() throws Exception {
        int opcion;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menú Principal - Gestor de EVENTOS");
            System.out.println("---------------------------------------------");
            System.out.println("1- Agregar evento");
            System.out.println("2- Listar eventos");
            System.out.println("3- Actualizar evento");
            System.out.println("4- Eliminar evento");
            System.out.println("5- Cerrar menú");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            System.out.println("---------------------------------------------");
            scanner.nextLine();
            try {

                switch (opcion) {
                    case 1:
                        agregarEvento();
                        break;
                    case 2:
                        listarEventos();
                        break;
                    case 3:
                        actualizarEvento();
                        break;
                    case 4:
                        eliminarEvento();
                        break;
                    case 5:
                        System.out.println("Saliendo del menú.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (DatoInvalidoExcepcion e) {
                System.out.println("!!!!!!!!!!Error¡¡¡¡¡¡¡¡¡¡");
                System.out.println(e.getMessage());
            }
        } while (opcion != 5);
    }

    private void agregarEvento() throws InputMismatchException, DatoInvalidoExcepcion {
        try {
            System.out.print("Ingrese el código del evento (numérico): ");
            int codigoEvento = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el título del evento: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese la descripción corta del evento: ");
            String descripcionCorta = scanner.nextLine();

            System.out.print("Ingrese la descripción extensa del evento: ");
            String descripcionExtensa = scanner.nextLine();

            System.out.print("Ingrese la fecha del evento (yyyy-mm-dd): ");
            String fechaStr = scanner.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd", Locale.ROOT);
            Date fecha = formatter.parse(fechaStr);

            System.out.print("Ingrese la imagen del evento: ");
            String imagen = scanner.nextLine();

            EstadosEvento estado = EstadosEvento.BORRADOR;

            List<Inscripto> inscriptos = new ArrayList<>();

            Evento evento = new Evento(codigoEvento, titulo, descripcionCorta, descripcionExtensa, fecha, imagen,
                    estado, inscriptos);
            gestorEventos.agregarEvento(evento);

            System.out.println("Evento agregado exitosamente.");
        } catch (InputMismatchException | ParseException e) {

            scanner.nextLine();
            throw new DatoInvalidoExcepcion("Error en el formato o tipo del dato ingresado.", e);
        }
    }

    private void listarEventos() {
        List<Evento> eventos = gestorEventos.listarEventos();
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos para mostrar.");
            return;
        }
        for (Evento evento : eventos) {
            System.out.println("Código: " + evento.getCodigoEvento() + ", Título: " + evento.getTitulo() + ", Descripción corta: " + evento.getDescripcionCorta() );
        }
    }

    private void actualizarEvento() {
        // Lógica para actualizar evento
    }

    private void eliminarEvento() {
        System.out.print("Ingrese el código del evento a eliminar: ");
        int codigoEvento = scanner.nextInt();
        gestorEventos.eliminarEvento(codigoEvento);
        System.out.println("Evento eliminado exitosamente.");
    }
}
