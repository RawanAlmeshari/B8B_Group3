/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.group;

import java.io.File;
import java.util.ArrayList;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Book method, of class Main.
     */
    @Test
    public void testBook() throws Exception {
        System.out.println("Book");
        //Main.Book();
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }

    /**
     * Test of cancelAppointmrnt method, of class Main.
     */
    @Test
    public void testCancelAppointmrnt() throws Exception {
        System.out.println("cancelAppointmrnt");
        Main.cancelAppointmrnt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showOptions method, of class Main.
     */
    @Test
    public void testShowOptions() {
        System.out.println("showOptions");
        Main.showOptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of servicesMenu method, of class Main.
     */
    @Test
    public void testServicesMenu() {
        System.out.println("servicesMenu");
        Main.servicesMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class Main.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        Main.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeEmployee method, of class Main.
     */
    @Test
    public void testStoreEmployee() throws Exception {
        System.out.println("storeEmployee");
        File file = null;
        Main.storeEmployee(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeServices method, of class Main.
     */
    @Test
    public void testStoreServices() throws Exception {
        System.out.println("storeServices");
        File file = null;
        Main.storeServices(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeCustomer method, of class Main.
     */
    @Test
    public void testStoreCustomer() throws Exception {
        System.out.println("storeCustomer");
        File file = null;
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = Main.storeCustomer(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeAppointment method, of class Main.
     */
    @Test
    public void testStoreAppointment() throws Exception {
        System.out.println("storeAppointment");
        File file = null;
        Main.storeAppointment(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchWorker method, of class Main.
     */
    @Test
    public void testSearchWorker() {
        System.out.println("searchWorker");
        String name = "jana";
        int expResult = 0;
        int result = Main.searchWorker(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of searchPhoneNum method, of class Main.
     */
    @Test
    public void testSearchPhoneNum() {
        System.out.println("searchPhoneNum");
        String phone = "0583928376";
        int expResult = 2;
        int result = Main.searchPhoneNum(phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of searchService method, of class Main.
     */
    @Test
    public void testSearchService() {
        System.out.println("searchService");
        String name = "hairCut";
        int expResult = 0;
        int result = Main.searchService(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of searchID method, of class Main.
     */
    @Test
    public void testSearchID() {
        System.out.println("searchID");
        String id = "";
        int expResult = 0;
        int result = Main.searchID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of appointmentsAssign method, of class Main.
     */
    @Test
    public void testAppointmentsAssign() {
        System.out.println("appointmentsAssign");
        String phone = "";
        String expResult = "";
        String result = Main.appointmentsAssign(phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateReport method, of class Main.
     */
    @Test
    public void testGenerateReport() {
        System.out.println("generateReport");
        Main.generateReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dashes method, of class Main.
     */
    @Test
    public void testDashes() {
        System.out.println("dashes");
        Main.dashes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printWorkSchedule method, of class Main.
     */
    @Test
    public void testPrintWorkSchedule() {
        System.out.println("printWorkSchedule");
        Main.printWorkSchedule();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchWorkerPhoneNum method, of class Main.
     */
    @Test
    public void testSearchWorkerPhoneNum() {
        System.out.println("searchWorkerPhoneNum");
        String phone = "0583728476";
        int expResult = 0;
        int result = Main.searchWorkerPhoneNum(phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }
    
}
