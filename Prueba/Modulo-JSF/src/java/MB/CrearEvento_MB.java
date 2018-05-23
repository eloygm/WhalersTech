package MB;

import grupoc.prscouts.Evento;
import grupoc.prscouts.TipoEvento;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author ala_j
 */
@Named(value = "crearEvento_MB")
@SessionScoped
public class CrearEvento_MB implements Serializable {

    /**
     * Creates a new instance of CrearEvento_MB
     */
    private String titulo;
    private String descripcion;
    private Evento ev;
    
    public void guardarEvento(){
    }

    public CrearEvento_MB() {
        ev = new Evento(TipoEvento.PAGO, null, null, null, titulo, descripcion, null, null, null, null);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Evento getEv() {
        return ev;
    }

    public void setEv(Evento ev) {
        this.ev = ev;
    }




    
}

