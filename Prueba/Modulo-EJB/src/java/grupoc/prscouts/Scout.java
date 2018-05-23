/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoc.prscouts;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Luis Ruiz 
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Scout extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_titulo;
    private boolean coordinador;
    @OneToMany (mappedBy = "id_scout")
    private List<Pago> pagos;
    @ManyToOne 
    private Seccion seccion;

    public Scout(Date fecha_titulo, boolean coordinador, Seccion seccion) {
        this.fecha_titulo = fecha_titulo;
        this.coordinador = coordinador;
        this.seccion = seccion;
    }

    
            

    
    public Date getFecha_titulo() {
        return fecha_titulo;
    }

    public void setFecha_titulo(Date fecha_titulo) {
        this.fecha_titulo = fecha_titulo;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public String toString() {
        return "Scout{" + "fecha_titulo=" + fecha_titulo + ", coordinador=" + coordinador + ", pagos=" + pagos + ", seccion=" + seccion + '}';
    }

    


}
