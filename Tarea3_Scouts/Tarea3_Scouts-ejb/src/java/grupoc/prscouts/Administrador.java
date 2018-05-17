/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoc.prscouts;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Jose Luis
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Administrador extends Usuario implements Serializable {

    private final Long serialVersionUID = 1L;

    public Administrador() {
    }

    public Administrador(String nombre, String apellido1, String apellido2, String contrasena, String DNI, Date fecha_nacimiento, Date fecha_alta) {
        super(nombre, apellido1, apellido2, contrasena, DNI, fecha_nacimiento, fecha_alta);
    }
    

    

}
