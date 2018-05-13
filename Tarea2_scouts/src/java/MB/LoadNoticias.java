/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import grupoc.prscouts.Evento;
/**
 *
 * @author Eloy
 */
@ManagedBean
@ViewScoped
public class LoadNoticias implements Serializable{
    private List<Evento> eventos;
     
    private Evento eventSel;
     
    @ManagedProperty("#{eventServ}")
    private eventServ service;
     
    @PostConstruct
    public void init() {
        eventos = service.createEventos(5);
    }
 
    public List<Evento> getEventos() {
        return eventos;
    }
 
    public void setService(eventServ service) {
        this.service = service;
    }
 
    public Evento getSelectedEvent() {
        return eventSel;
    }
 
    public void setSelectedCar(Evento eventSel) {
        this.eventSel = eventSel;
    }
}

