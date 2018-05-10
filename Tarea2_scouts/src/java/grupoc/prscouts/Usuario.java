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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Luis Ruiz
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_usuario;
    @Column (nullable = false)
    private String nombre;
    @Column (nullable = false)
    private String apellido1;
    @Column (nullable = false)
    private String apellido2;
    @Column (nullable = false)
    private String contrasena;
    @Column (nullable = false)
    private String DNI;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_alta;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_baja;
    @Column (nullable = false)
    private boolean estado_perfil;
    @OneToMany 
    private List<Documentacion> documentos;
    @OneToMany
    private List<Comentario_evento> comentarios;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String contrasena, String DNI, Date fecha_nacimiento, Date fecha_alta) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.contrasena = contrasena;
        this.DNI = DNI;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_alta = fecha_alta;
    }

    

   
    
    public Long getId() {
        return id_usuario;
    }

    public void setId(long id) {
        this.id_usuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public boolean isEstado_perfil() {
        return estado_perfil;
    }

    public void setEstado_perfil(boolean estado_perfil) {
        this.estado_perfil = estado_perfil;
    }

    public List getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List documentos) {
        this.documentos = documentos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (this.id_usuario ^ (this.id_usuario >>> 32));
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
        final Usuario other = (Usuario) obj;
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id_usuario + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", contrase\u00f1a=" + contrasena + ", DNI=" + DNI + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_alta=" + fecha_alta + ", fecha_baja=" + fecha_baja + ", estado_perfil=" + estado_perfil + ", documentos=" + documentos + '}';
    }
    
}
