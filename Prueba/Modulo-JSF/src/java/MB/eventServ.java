/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

/**
 *
 * @author Eloy
 */
import grupoc.prscouts.Asistentes_Evento;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import grupoc.prscouts.Evento;
import grupoc.prscouts.TipoEvento;
import java.util.Date;
import grupoc.prscouts.Seccion;
import grupoc.prscouts.Usuario;
import java.util.Arrays;
 
@ManagedBean(name = "eventServ")
@ApplicationScoped
public class eventServ {
    
    private static String descripcion;
    
    private final static String[] titulo;
    
    static {         
        titulo = new String[5];
        titulo[0] = "Aprende a hacer tu mochila";
        titulo[1] = "Excursion a los montes";
        titulo[2] = "Charla formativa";
        titulo[3] = "Taller de relajacion";
        titulo[4] = "Taller de dinamizacion";
        
        descripcion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur malesuada ornare gravida. Morbi rhoncus dignissim justo pellentesque semper. Quisque sed turpis fermentum, posuere felis at, volutpat velit. Nulla cursus diam ipsum, vel rutrum magna dignissim ac. Fusce scelerisque accumsan nunc, ultrices tristique nulla convallis et. Phasellus felis dolor, facilisis ut dictum ut, malesuada sed justo. Cras ac erat accumsan metus bibendum vulputate. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi maximus tempor mi in convallis. Sed orci tortor, suscipit porta augue non, porttitor pulvinar purus. Aliquam quis neque sit amet orci fringilla vestibulum ac et massa. Vestibulum tristique mauris non nisi pretium efficitur. Vivamus et nulla dapibus, sollicitudin metus eget, pulvinar urna. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Morbi commodo, nisi sit amet blandit vestibulum, nulla quam gravida augue, eu aliquam metus purus at metus. Vestibulum sed lorem euismod, hendrerit sem nec, maximus velit.\n" +"\n" +
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac accumsan diam. Vivamus rutrum eleifend quam, sed egestas magna malesuada nec. Vivamus tincidunt consectetur sem, vitae mollis ante feugiat non. Integer vel nulla ac mi porttitor iaculis. Nunc commodo odio a nibh laoreet commodo. Pellentesque interdum suscipit cursus. Nunc bibendum mollis est, vitae egestas orci ullamcorper ut. Duis ornare pellentesque dui.";
    }
    Date date = new java.util.Date(2018,8,28);
    //SimpleDateFormat sdf=new SimpleDateFormat("2018-08-02");
    //String fecha = sdf.format(date);
   
     
    public List<Evento> createEventos(int size) {
        List<Evento> list = new ArrayList<Evento>();
        List<Asistentes_Evento> listagente = new ArrayList<Asistentes_Evento>();
        
       // Date fecha = new Date(); //RECOGE LA FECHA DE HOY
        //Usuario usuario = new Usuario("PEPE", "CONTRERAS", "FUENTES", "NOSESABEULIO", "23445678T", fecha, fecha);
        //nombreU = usuario.getNombre()+" "+usuario.getApellido1()+" "+usuario.getApellido2();
        for(int i = 0 ; i < size ; i++) {
            //Evento(TipoEvento tipoEvento, Date fechaInicio, Date fechaFin, String Imagen, String titulo, String descripcion, Seccion seccion, List<Pago> createdByPago, List<Comentario_evento> comentario_evento, List<Asistentes_Evento> asistentes_evento)
            //list.add(new Evento(TipoEvento.GRATIS, Date.from(Instant.parse("2018-08-02")), Date.from(Instant.parse("2018-08-02")), getRandomImagen(), getRandomTitulo(), getDescripcion(), null, null, null, null));
            list.add(new Evento(TipoEvento.GRATIS, date, date, getRandomImagen(), getRandomTitulo(), getDescripcion(), null, null, null, listagente));

        }
         
        return list;
    }
     
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private String getRandomTitulo() {
        return titulo[(int) (Math.random() * 5)];
    }
     
    public String getRandomImagen() {
        return "./datos/2017-05-18.jpg";
    }
     
    public String getDescripcion() {
        return descripcion;
    }
 
    public List<String> getTitulos() {
        return Arrays.asList(titulo);
    }
     
}
