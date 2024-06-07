package gestionEventos;

import java.util.Date;
import java.util.List;

public class Evento {
    private int codigoEvento;
    private String titulo;
    private String descripcionCorta;
    private String descripcionExtensa;
    private Date fecha;
    private String imagen;
    private EstadosEvento estado;
    private List<Inscripto> inscriptos;

    public Evento(int codigoEvento, String titulo, String descripcionCorta, String descripcionExtensa, Date fecha, String imagen, EstadosEvento estado, List<Inscripto> inscriptos) {
        this.codigoEvento = codigoEvento;
        this.titulo = titulo;
        this.descripcionCorta = descripcionCorta;
        this.descripcionExtensa = descripcionExtensa;
        this.fecha = fecha;
        this.imagen = imagen;
        this.estado = estado;
        this.inscriptos = inscriptos;
    }


    public int getCodigoEvento() {
        return codigoEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public String getDescripcionExtensa() {
        return descripcionExtensa;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public EstadosEvento getEstado() {
        return estado;
    }

    public List<Inscripto> getInscriptos() {
        return inscriptos;
    }

    public List<Inscripto> listarInscriptos() {
        return inscriptos;
    }

}
