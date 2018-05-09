/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoc.prscouts;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author José Frnacisco Enríquez
 */
@Entity
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pago;
    @Column(nullable = false)
    private Double importe;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date f_emision;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date h_emision;
    
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date f_validacion;
    
    @Enumerated (EnumType.STRING)
    private EstadoPago estadoPago;
    
    //@Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "fk_cod_evento", nullable = false)
    private Evento cod_evento;
    
    //@Column(nullable = true)
    @ManyToOne
    @JoinColumn(name = "fk_id_educando", nullable = true)
    private Educando id_educando;
    
    //@Column (nullable = true)
    @ManyToOne
    @JoinColumn(name = "fk_id_scout", nullable = true)
    private Scout   id_scout;

    public Long getId_pago() {
        return id_pago;
    }

    public void setId_pago(Long id_pago) {
        this.id_pago = id_pago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Date getF_emision() {
        return f_emision;
    }

    public void setF_emision(Date f_emision) {
        this.f_emision = f_emision;
    }

    public Date getH_emision() {
        return h_emision;
    }

    public void setH_emision(Date h_emision) {
        this.h_emision = h_emision;
    }

    public Date getF_validacion() {
        return f_validacion;
    }

    public void setF_validacion(Date f_validacion) {
        this.f_validacion = f_validacion;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(EstadoPago estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Evento getCod_evento() {
        return cod_evento;
    }

    public void setCod_evento(Evento cod_evento) {
        this.cod_evento = cod_evento;
    }

    public Educando getId_educando() {
        return id_educando;
    }

    public void setId_educando(Educando id_educando) {
        this.id_educando = id_educando;
    }

    public Scout getId_scout() {
        return id_scout;
    }

    public void setId_scout(Scout id_scout) {
        this.id_scout = id_scout;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id_pago);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pago other = (Pago) obj;
        if (!Objects.equals(this.id_pago, other.id_pago)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pago{" + "id_pago=" + id_pago + ", importe=" + importe + ", f_emision=" + f_emision + ", h_emision=" + h_emision + ", f_validacion=" + f_validacion + ", estadoPago=" + estadoPago + ", cod_evento=" + cod_evento + ", id_educando=" + id_educando + ", id_scout=" + id_scout + '}';
    }
    

}
