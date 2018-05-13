/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import grupoc.prscouts.Usuario;
import java.util.*;
import javax.annotation.ManagedBean;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Martin
 */
@Named(value = "Perfil")
@Dependent
public class Perfil {
    Date fecha_alta = new java.util.Date(21/05/200);
    Date fecha_nacimiento = new java.util.Date(21/05/1999);
    private Usuario usuario;            
    private String nombre;
    private String ap1;
    private String ap2;
    private String contrasena;
    private String DNI;
    public Perfil() {   
       
        usuario = new Usuario("PEPE", "CONTRERAS", "FUENTES", "NOSESABEULIO", "23445678T", fecha_alta, fecha_nacimiento);
        nombre = usuario.getNombre();
        ap1 = usuario.getApellido1();
        ap2 = usuario.getApellido2();
        contrasena = usuario.getContrasena();
        DNI = usuario.getDNI();
        fecha_nacimiento = usuario.getFecha_nacimiento();
        fecha_alta = usuario.getFecha_alta();        
    }
    
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
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
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}