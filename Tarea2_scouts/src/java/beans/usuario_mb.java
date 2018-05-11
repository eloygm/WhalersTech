/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import grupoc.prscouts.*;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Cherico
 */
@Named(value = "usuario_mb")
@ApplicationScoped
public class usuario_mb {

    private Usuario usuario;
    private String nombre;
    private List<String> nombres;
    private List<Usuario> usuarioL;
    private Integer autoincrementado;
    /**
     * Creates a new instance of usuario_mb
     */
    public usuario_mb() {
        usuarioL = new ArrayList<>();
        usuario = new Usuario();
        autoincrementado = 0;
        nombres = new ArrayList<>();
    }
    public String createUsuario(){
    
        usuario.setNombre(nombre);
        usuario.setId(autoincrementado+1);
        usuarioL.add(usuario);
        nombres.add(nombre);
        
        return null;
    }

    public List<String> getNombres() {
        return nombres;
    }

    public void setNombres(List<String> nombres) {
        this.nombres = nombres;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarioL() {
        return usuarioL;
    }

    public void setUsuarioL(List<Usuario> usuarioL) {
        this.usuarioL = usuarioL;
    }
    
    
}
