package facades;

import dto.CustomerDTO;
import entities.BankCustomer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class BankCustomerFacade {

    private static BankCustomerFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private BankCustomerFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static BankCustomerFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new BankCustomerFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public CustomerDTO getBankCustomerByID(Long id){
         EntityManager em = emf.createEntityManager();
        try{
            CustomerDTO b_customer = em.find(CustomerDTO.class,id);
            return b_customer;
        }finally {
            em.close();
        }
    }
    
    public List<BankCustomer> getAllBankCustomers(){
         EntityManager em = emf.createEntityManager();
        try{
            TypedQuery<BankCustomer> query = em.createQuery("Select customer from Customer customer",BankCustomer.class);
            return query.getResultList();
        }finally {
            em.close();
        }
    }
    
    public BankCustomer addCustomer(BankCustomer cust){
         BankCustomer b_customer = new BankCustomer();
         EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(b_customer);
            em.getTransaction().commit();
            return cust;
        }finally {
            em.close();
        }
    }
    
//List<customerDTO> getCustomerByName(String name)


    
}
