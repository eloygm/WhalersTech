/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import grupoc.prscouts.Documentacion;
import grupoc.prscouts.TiposDocumento;
import grupoc.prscouts.Usuario;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Cherico
 */
@Named(value = "documentacion_mb")
@ApplicationScoped
public class documentacion_mb implements Serializable {

    private Documentacion doc;
    private List<Documentacion> docL;
    private Map<Usuario, List<Documentacion>> docPorUsuario;
    private Integer ultimoIDdoc = 0;

    public documentacion_mb() {
        docL = new ArrayList<Documentacion>();
        docPorUsuario = new HashMap<Usuario, List<Documentacion>>();

    }

    /*    
Long id_documento,
Usuario createdByUsuario,
EstadoDocumentacion estado ,
String nombreFichero,
TiposDocumento tipo_Documentacion,
Date Fecha_subida,   
Double Tam_byte,
Date Fecha_Validacion,
String Ruta */
    public void subirDoc(Usuario createdByUsuario, File archivo, String Ruta) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        if (extPermitada(getExtension(archivo.getName()))) {
           // doc = new Documentacion(ultimoIDdoc + 1, createdByUsuario.getId(), archivo.getName(), archivo.length(), archivo.getPath());
            ctx.addMessage(null, new FacesMessage("Documento subido correctamente"));
        } else {
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro:","Extension del documento no valida"));
        }
    }

    private Boolean extPermitada(String extension) {
        boolean loes = false;
        
        Iterator<TiposDocumento> it = Arrays.asList(TiposDocumento.values()).iterator();
        
        while(!loes || it.hasNext()){
            if(it.next().equals(extension.toUpperCase())){
                loes = true;
            }
        }
        return loes;
    }

    private String getExtension(String nombreFichero) {

        String extension;
        extension = "";

        try (Scanner sc = new Scanner(nombreFichero)) {

            sc.useDelimiter(".");

            while (sc.hasNext()) {
                extension = sc.next();
            }

        } catch (Exception e) {

        }

        return extension;
    }
}

