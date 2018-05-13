/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import grupoc.prscouts.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Cherico
 */
@Named(value = "usuario_mb")
@ApplicationScoped
public class usuario_mb {

    private Long id_usuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String contrasena;
    private String DNI;
    private Date fecha_nacimiento;
    private File file;
    private String fileName;
    private Boolean estado;
    private Integer autoincrementado;
   
    
    private List<Usuario> users;
    
     public usuario_mb() {
        users=new ArrayList();
        autoincrementado = 0;
       
    }


   
    public void click() {
        PrimeFaces.current().ajax().update("form:display");
        PrimeFaces.current().executeScript("PF('dlg').show()");
    }
   
   
 
    public String crearUsuario() {
      
        FacesContext.getCurrentInstance().addMessage(null,
         new FacesMessage(nombre + " " + apellido1 + " registrado correctamente"));
        
        Usuario nuevo= new Usuario();
                
        nuevo.setDNI(DNI);
        nuevo.setId(autoincrementado+1);
        nuevo.setNombre(nombre);
        nuevo.setApellido1(apellido1);
        nuevo.setApellido2(apellido2);
        nuevo.setContrasena(contrasena);
        nuevo.setEstado_perfil(false);
       
        nuevo.setFecha_alta(new Date());
        nuevo.setFecha_nacimiento(fecha_nacimiento);
        
        
       users.add(nuevo);
       
        return null;
       
     
        }
    
    public String updateUsuario(){
        
      ListIterator<Usuario> it = users.listIterator();
        
        Usuario update = null;
        while(it.hasNext() || update!=null ){
            if(it.next().getId().equals(id_usuario)){
                update = it.next();
            }
        }

        update.setDNI(DNI);
        update.setNombre(nombre);
        update.setApellido1(apellido1);
        update.setApellido2(apellido2);
        update.setContrasena(contrasena);
        update.setEstado_perfil(estado);
      
        FacesContext.getCurrentInstance().addMessage(null,
         new FacesMessage("Actualizado correctamente"));
        
        return null;
    }
    
    public String deleteUsuario(){
        
         ListIterator<Usuario> it = users.listIterator();
        
         
         
        Boolean borrado = false;
        while(!borrado || it.hasNext() ){
            if(it.next().getId().equals(id_usuario)){
                users.remove(it.next());
                borrado = true;
            }
        }
        
       return "./admin_Usuarios";
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getAutoincrementado() {
        return autoincrementado;
    }

    public void setAutoincrementado(Integer autoincrementado) {
        this.autoincrementado = autoincrementado;
    }

    public List<Usuario> getUsers() {
        return users;
    }

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }

   
    
    
}
