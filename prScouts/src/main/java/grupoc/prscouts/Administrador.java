/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoc.prscouts;

import java.io.Serializable;
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

}
