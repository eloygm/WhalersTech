package MB;

import grupoc.prscouts.Administrador;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import grupoc.prscouts.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
 

 
@Named(value = "log")
@RequestScoped
public class log {
   
    private String usuario;
    private String contrasenia;
    private List<Usuario> usuarios;
    private Date fecha = new Date();
    
    
    @Inject
    private ControlAutorizacion ctrl;
    
    public log() {
        usuarios = new ArrayList<Usuario>();
        //usuarios.add(new Usuario("pepe", "asdf", Login.Usuario.Rol.NORMAL));
        usuarios.add(new Usuario("PEPE", "CONTRERAS", "FUENTES", "asdf", "23445678T", fecha, fecha));
        usuarios.add(new Administrador("Antonio", "Madueñas", "Fuertes", "qwert", "23445699T", fecha, fecha));
        //usuarios.add(new Usuario("manolo", "qwer", Login.Usuario.Rol.ADMINISTRADOR));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        // Implementar este método
        FacesContext ctx;
        ctx = FacesContext.getCurrentInstance();
        
        boolean encontrado = false;
        for(int i=0; i<usuarios.size();i++){
            
            if(usuarios.get(i).getNombre().equals(usuario)){
                encontrado = true;
                if(usuarios.get(i).getContrasena().equals(contrasenia)){
                    
                    ctrl.setUsuario(usuarios.get(i));
                    
                   return ctrl.home();
                    
                } else {
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "La contraseña no coincide.", "La contraseña no coincide."));
                }
            }
            
        }
        if(!encontrado)
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "El usuario no existe.", "El usuario no existe."));
        
        return null;
        
    }
}