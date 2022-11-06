/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.group;

import java.util.Date;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of converToDate method, of class Appointment.
     */
    @Test
    public void testConverToDate() {
        System.out.println("converToDate");
        String date = "";
        Appointment instance = new Appointment();
        Date expResult = null;
        Date result = instance.converToDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Appointment instance = new Appointment();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Appointment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChosenService method, of class Appointment.
     */
    @Test
    public void testGetChosenService() {
        System.out.println("getChosenService");
        Appointment instance = new Appointment();
        Service expResult = null;
        Service result = instance.getChosenService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Appointment.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Appointment instance = new Appointment();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Appointment instance = new Appointment();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Appointment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Appointment instance = new Appointment();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChosenService method, of class Appointment.
     */
    @Test
    public void testSetChosenService() {
        System.out.println("setChosenService");
        Service chosenService = null;
        Appointment instance = new Appointment();
        instance.setChosenService(chosenService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Appointment.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Appointment instance = new Appointment();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFormat method, of class Appointment.
     */
    @Test
    public void testGetDateFormat() {
        System.out.println("getDateFormat");
        Date date = null;
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getDateFormat(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Appointment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileFormat method, of class Appointment.
     */
    @Test
    public void testFileFormat() {
        System.out.println("fileFormat");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.fileFormat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wirteOnFile method, of class Appointment.
     */
    @Test
    public void testWirteOnFile() {
        System.out.println("wirteOnFile");
        String whatToWrite = "";
        Appointment.wirteOnFile(whatToWrite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromFile method, of class Appointment.
     */
    @Test
    public void testRemoveFromFile() throws Exception {
        System.out.println("removeFromFile");
        String whatToDelete = "";
        Appointment.removeFromFile(whatToDelete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
