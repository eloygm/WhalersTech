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

/**
 *
 * @author Jose Luiz Ruiz
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Educando extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column (nullable = false)
    private String DNI_tutor;
    @Column (nullable = false)
    private String nombre_tutor;
    @Column (nullable = false)
    private String apellido1_tutor;
    private String apellido2_tutor;
    @OneToMany (mappedBy = "id_educando")
    private List<Pago> pagos;
    @OneToMany (mappedBy = "id_usuario")
    private List<Asistentes_Evento> asistencias;
    @ManyToOne 
    private Seccion seccion;

    public Educando(String DNI_tutor, String nombre_tutor, String apellido1_tutor, String apellido2_tutor, Seccion seccion) {
        this.DNI_tutor = DNI_tutor;
        this.nombre_tutor = nombre_tutor;
        this.apellido1_tutor = apellido1_tutor;
        this.apellido2_tutor = apellido2_tutor;
        this.seccion = seccion;
    }

    public Educando(String DNI_tutor, String nombre_tutor, String apellido1_tutor, String apellido2_tutor, Seccion seccion, String nombre, String apellido1, String apellido2, String contrasena, String DNI, Date fecha_nacimiento, Date fecha_alta) {
        super(nombre, apellido1, apellido2, contrasena, DNI, fecha_nacimiento, fecha_alta);
        this.DNI_tutor = DNI_tutor;
        this.nombre_tutor = nombre_tutor;
        this.apellido1_tutor = apellido1_tutor;
        this.apellido2_tutor = apellido2_tutor;
        this.seccion = seccion;
    }

 


    
    
    public String getDNI_tutor() {
        return DNI_tutor;
    }

    public void setDNI_tutor(String DNI_tutor) {
        this.DNI_tutor = DNI_tutor;
    }

    public String getNombre_tutor() {
        return nombre_tutor;
    }

    public void setNombre_tutor(String nombre_tutor) {
        this.nombre_tutor = nombre_tutor;
    }

    public String getApellido1_tutor() {
        return apellido1_tutor;
    }

    public void setApellido1_tutor(String apellido1_tutor) {
        this.apellido1_tutor = apellido1_tutor;
    }

    public String getApellido2_tutor() {
        return apellido2_tutor;
    }

    public void setApellido2_tutor(String apellido2_tutor) {
        this.apellido2_tutor = apellido2_tutor;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }


    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Educando{" + "DNI_tutor=" + DNI_tutor + ", nombre_tutor=" + nombre_tutor + ", apellido1_tutor=" + apellido1_tutor + ", apellido2_tutor=" + apellido2_tutor + ", pagos=" + pagos + ", asistencias=" + asistencias + ", seccion=" + seccion + '}';
    }

    
    
}
