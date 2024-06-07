
package gestionEventos;
public class DatoInvalidoExcepcion extends Exception {
    public DatoInvalidoExcepcion(String mensaje, Exception excepcion) {
        super(mensaje, excepcion);
    }
}