/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.group;

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
public class ReportTest {
    
    public ReportTest() {
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
     * Test of generateReport method, of class Report.
     */
    @Test
    public void testGenerateReport() {
        System.out.println("generateReport");
        Appointment appointment = null;
        Report instance = new Report();
        instance.generateReport(appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Report method, of class Report.
     */
    @Test
    public void testReport() {
        System.out.println("Report");
        ArrayList<Appointment> appointment = null;
        Report instance = new Report();
        instance.Report(appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIncome method, of class Report.
     */
    @Test
    public void testCalculateIncome() {
        System.out.println("calculateIncome");
        ArrayList<Appointment> appointment = null;
        Report instance = new Report();
        int expResult = 0;
        int result = instance.calculateIncome(appointment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateServices method, of class Report.
     */
    @Test
    public void testCalculateServices() {
        System.out.println("calculateServices");
        ArrayList<Appointment> appointment = null;
        String service = "";
        Report instance = new Report();
        int expResult = 0;
        int result = instance.calculateServices(appointment, service);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePrice method, of class Report.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        ArrayList<Appointment> appointment = null;
        int i = 0;
        ArrayList<Service> service = null;
        Report instance = new Report();
        double expResult = 0.0;
        double result = instance.calculatePrice(appointment, i, service);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
