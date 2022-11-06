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
        Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getId method, of class Appointment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        String expResult = "15";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getChosenService method, of class Appointment.
     */
    @Test
    public void testGetChosenService() {
        System.out.println("getChosenService");
         Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        Service expResult =service;
        Service result = instance.getChosenService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCustomer method, of class Appointment.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        Customer expResult = customer;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

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
        String id = "12";
         Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        instance.setId(id);
        String result ="12";
        String expResult = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setChosenService method, of class Appointment.
     */
    @Test
    public void testSetChosenService() {
        System.out.println("setChosenService");
        Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        Service chosenService = new Service("wax",100,worker);
        instance.setChosenService(chosenService);
        Service result = chosenService;
        Service expResult = instance.getChosenService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCustomer method, of class Appointment.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
         Worker worker= new Worker("gadoo","ghadah", 1234, "0593480888", "ghadahSultan75@gmail",30000);
        Service service = new Service("wax",12.5,worker);
        Customer customer = new Customer("roro","rawan", 2345, "0523232312","rawan75@gmail");
        Appointment instance = new Appointment("15",service ,customer,"12-12-2022");
        Customer customer1 = new Customer("lolo","layan", 1212, "0523232312","lolo75@gmail");
        instance.setCustomer(customer1);
        Customer result =customer1 ;
        Customer expResult = instance.getCustomer();
        assertEquals(expResult, result);
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
