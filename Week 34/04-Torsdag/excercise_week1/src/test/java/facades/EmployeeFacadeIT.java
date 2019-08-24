/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Employee;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeppe
 */
public class EmployeeFacadeIT {
    
    public EmployeeFacadeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFacadeExample method, of class EmployeeFacade.
     */
    @Test
    public void testGetFacadeExample() {
        System.out.println("getFacadeExample");
        EntityManagerFactory _emf = null;
        EmployeeFacade expResult = EmployeeFacade.getFacadeExample(_emf);
        EmployeeFacade result = EmployeeFacade.getFacadeExample(_emf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeById method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeeById() {
        System.out.println("getEmployeeById");
        int id = 0;
        EmployeeFacade instance = null;
        Employee expResult = null;
        Employee result = instance.getEmployeeById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeesByName method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeesByName() {
        System.out.println("getEmployeesByName");
        String name = "";
        EmployeeFacade instance = null;
        Employee expResult = null;
        Employee result = instance.getEmployeesByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class EmployeeFacade.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        EmployeeFacade instance = null;
        List<Employee> expResult = null;
        List<Employee> result = instance.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeesWithHighestSalary method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeesWithHighestSalary() {
        System.out.println("getEmployeesWithHighestSalary");
        EmployeeFacade instance = null;
        List<Employee> expResult = null;
        List<Employee> result = instance.getEmployeesWithHighestSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEmployee method, of class EmployeeFacade.
     */
    @Test
    public void testCreateEmployee() {
        System.out.println("createEmployee");
        String name = "";
        String address = "";
        double salary = 0.0;
        EmployeeFacade instance = null;
        Employee expResult = null;
        Employee result = instance.createEmployee(name, address, salary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
