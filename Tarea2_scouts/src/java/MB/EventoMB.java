/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;


import grupoc.prscouts.Evento;
import grupoc.prscouts.*;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


/**
 *
 * @author Francisco Gamez
 */
@Named(value = "eventoMB")
@ApplicationScoped
public class EventoMB {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    private Evento ev;                  //OBJETO EVENTO
    private String comentario;          //COMENTARIO QUE SE ESCRIBE
    private List<String> comentarios;   //LA LISTA DE LOS COMENTARIOS
    private List<String> listagente;    //LISTA DE ASISTENTES AL EVENTO
    private Comentario_evento comen;
    java.util.Date fecha;
    private Usuario usuario;            //OBJETO USUARIO
    private String nombreU;             //NOMBRE DEL USUARIO
    private String nombreE;             //TITULO DEL EVENTO
    private String descripcionE;        //DESCRIPCION DEL EVENTO
    private String fotoEv;              //FOTO DEL EVENTO
    
   
    public EventoMB() {
        comentarios = new ArrayList<>();
        listagente = new ArrayList<>();
        fecha = new Date(); //RECOGE LA FECHA DE HOY
        usuario = new Usuario("PEPE", "CONTRERAS", "FUENTES", "NOSESABEULIO", "23445678T", fecha, fecha);
        nombreU = usuario.getNombre()+" "+usuario.getApellido1()+" "+usuario.getApellido2();
        comen = new Comentario_evento(comentario, fecha, usuario, ev);
        
        
    }
    
    //GUARDAR EL COMENTARIO E IMPRIMIR
    public String guardarComentario(){
        comentarios.add("Nombre completo: "+nombreU);
        comentarios.add("Comentario: "+comentario);
        comentarios.add("Fecha: "+fecha);
        comentarios.add("___________________________________________________________");
               
        return null;
    }
    //MENSAJE DE AÑADIDO AL EVENTO
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    public void mensajeAñadido() {
        addMessage("PERFECTO", "Añadido al evento");
    }
     
    //PARA BUSCAR SI YA ESTA EN LA LISTA DEL EVENTO
    public boolean buscarListaUs(){
        boolean esta = false;
        for(int i = 0; i < listagente.size(); i++){
           if(listagente.get(i) == nombreU){
               esta = true;
               i = listagente.size();
           }    
        }
                        
        return esta;//Si es false entra en la lista
    }
    
    //GETTER Y SETTER    
    public String getFotoEv() {
        return fotoEv;
    }

    public void setFotoEv(String fotoEv) {
        this.fotoEv = fotoEv;
    }
    
    
    public Evento getEv() {
        return ev;
    }

    public void setEv(Evento ev) {
        this.ev = ev;
        this.nombreE = ev.getTitulo();
        this.descripcionE = ev.getDescripcion();
        this.fotoEv = getFotoEv();
    }
    
    
    public String listaGente(){
        
        listagente.add(nombreU);
        return null;
    }
    
    public List<String> getListagente() {
        return listagente;
    }

    public void setListagente(List<String> listagente) {
        this.listagente = listagente;
    }
   
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    public Comentario_evento getComen() {
        return comen;
    }

    public void setComen(Comentario_evento comen) {
        this.comen = comen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
