/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.group;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of getName method, of class Service.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Service instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Service.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Service instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoneBy method, of class Service.
     */
    @Test
    public void testGetDoneBy() {
        System.out.println("getDoneBy");
        Service instance = null;
        Worker expResult = null;
        Worker result = instance.getDoneBy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Service.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Service instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Service.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Service instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoneBy method, of class Service.
     */
    @Test
    public void testSetDoneBy() {
        System.out.println("setDoneBy");
        Worker doneBy = null;
        Service instance = null;
        instance.setDoneBy(doneBy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Service.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Service service = null;
        Service instance = null;
        String expResult = "";
        String result = instance.toString(service);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
