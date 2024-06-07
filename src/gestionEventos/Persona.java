package gestionEventos;
import java.util.Date;

public class Persona {
    private int codigoPersona;
    private String documento;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String email;
    private boolean esInteresado;
    private Date alta;
    private Date actualizacion;

    public Persona(int codigoPersona, String documento, String nombre, String apellido, Date fechaNacimiento, String email, boolean esInteresado, Date alta, Date actualizacion) {
        this.codigoPersona = codigoPersona;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.esInteresado = esInteresado;
        this.alta = alta;
        this.actualizacion = actualizacion;
    }



    public int getCodigoPersona() {
        return codigoPersona;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public boolean getEsInteresado() {
        return esInteresado;
    }

    public Date getAlta() {
        return alta;
    }

    public Date getActualizacion() {
        return actualizacion;
    }
}
