/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Jeppe
 */
public class CustomerFacade {
    private static EntityManagerFactory emf;
    private static CustomerFacade instance;

        public static void main(String[] args) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");      
    CustomerFacade facade = CustomerFacade.getCustomerFacade(emf);
    Customer c1 = facade.addCustomer("Ib","Ibsen");
    Customer c2 = facade.addCustomer("Ned","Nielsen");
    Customer c3 = facade.addCustomer("Gerd","Karlsen");
    //Find customer by ID
    System.out.println("Customer 1: "+facade.findByID(c1.getId()).getFirstName());
    System.out.println("Customer 2: "+facade.findByID(c2.getId()).getFirstName());
    System.out.println("Customer 3: "+facade.findByID(c3.getId()).getFirstName());   
    //Find all customers
    System.out.println("Number of customers: "+facade.allCustomers().size());
    }
    
    
    private CustomerFacade() {}

    public static CustomerFacade getCustomerFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CustomerFacade();
        }
        return instance;
    }
    
    public Customer addCustomer(String fName, String lName){
        Customer customer = new Customer(fName,lName);
        
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            return customer;
        }finally {
            em.close();
        }
    }
    
    public Customer findByID(int id){
         EntityManager em = emf.createEntityManager();
        try{
            Customer customer = em.find(Customer.class,id);
            return customer;
        }finally {
            em.close();
        }
    }
    public Customer findByLastName(String lastName){
         EntityManager em = emf.createEntityManager();
        try{
            Customer customer = em.find(Customer.class,lastName);
            return customer;
        }finally {
            em.close();
        }
    }
    
    public List<Customer> allCustomers(){
         EntityManager em = emf.createEntityManager();
        try{
            TypedQuery<Customer> query = 
                       em.createQuery("Select customer from Customer customer",Customer.class);
            return query.getResultList();
        }finally {
            em.close();
        }
    }
    
    //TODO int getNumberOfCustomers();
    
}