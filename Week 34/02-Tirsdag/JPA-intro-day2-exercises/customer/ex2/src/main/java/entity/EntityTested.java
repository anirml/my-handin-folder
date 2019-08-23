/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Jeppe
 */
public class EntityTested {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        
        EntityManager em = emf.createEntityManager();
        try{
            Customer c1 = new Customer("Jens","Jensen");
            Customer c2 = new Customer("Palle","Holm");
            Customer c3 = new Customer("Kim","Larsen");
            
            
            em.getTransaction().begin();
            
            em.persist(c1);
            em.persist(c2);
            em.persist(c3);
            
            em.getTransaction().commit();
            
        }finally{
            em.close();
        }
        
    }       
            
   
}
