package gestionEventos;
import java.util.Date;

public class Inscripto extends Persona {
    private boolean transportePropio;
    private RestriccionAlimentaria restriccionAlimentaria;

    public Inscripto(int codigoPersona, String documento, String nombre, String apellido, Date fechaNacimiento, String email, boolean esInteresado, Date alta, Date actualizacion, boolean transportePropio, RestriccionAlimentaria restriccionAlimentaria) {
        super(codigoPersona, documento, nombre, apellido, fechaNacimiento, email, esInteresado, alta, actualizacion);
        this.transportePropio = transportePropio;
        this.restriccionAlimentaria = restriccionAlimentaria;
    }


    public boolean isTransportePropio() {
        return transportePropio;
    }

    public RestriccionAlimentaria getRestriccionAlimentaria() {
        return restriccionAlimentaria;
    }
}
