/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jeppe
 */
public class CustomerFacadeTest {
    
    public CustomerFacadeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class CustomerFacade.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CustomerFacade.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerFacade method, of class CustomerFacade.
     */
    @Test
    public void testGetCustomerFacade() {
        System.out.println("getCustomerFacade");
        EntityManagerFactory _emf = null;
        CustomerFacade expResult = null;
        CustomerFacade result = CustomerFacade.getCustomerFacade(_emf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class CustomerFacade.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String fName = "";
        String lName = "";
        CustomerFacade instance = null;
        Customer expResult = null;
        Customer result = instance.addCustomer(fName, lName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByID method, of class CustomerFacade.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        int id = 0;
        CustomerFacade instance = null;
        Customer expResult = null;
        Customer result = instance.findByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByLastName method, of class CustomerFacade.
     */
    @Test
    public void testFindByLastName() {
        System.out.println("findByLastName");
        String lastName = "";
        CustomerFacade instance = null;
        Customer expResult = null;
        Customer result = instance.findByLastName(lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allCustomers method, of class CustomerFacade.
     */
    @Test
    public void testAllCustomers() {
        System.out.println("allCustomers");
        CustomerFacade instance = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.allCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
