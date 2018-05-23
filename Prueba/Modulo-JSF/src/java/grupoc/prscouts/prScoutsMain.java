/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoc.prscouts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Francisco
 */
public class prScoutsMain {
    
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("grupoc_prScouts_jar_1.0-SNAPSHOTPU");

       EntityManager em = emf.createEntityManager();

        // aquí las consultas y transacciones con la base de datos 

       em.close();

       emf.close();
    }
}
