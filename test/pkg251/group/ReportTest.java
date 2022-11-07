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
     * Test of calculateIncome method, of class Report.
     */
    @Test
    public void testCalculateIncome() {
        Service service = new Service("wax",125,null);
        Appointment s = new Appointment("15",service ,null,"12-12-2022");
        
        ArrayList<Appointment> appointment = new ArrayList<>();
        appointment.add(s);
        appointment.add(s);
        
        Report instance = new Report();
        double expResult = 250;
        double result = instance.calculateIncome(appointment);
        assertEquals(expResult, result,0.5);
        
    }

    /**
     * Test of calculateServices method, of class Report.
     */
    @Test
    public void testCalculateServices() {
        Service service = new Service("wax",125,null);
        Appointment s = new Appointment("15",service ,null,"12-12-2022");
        
        ArrayList<Appointment> appointment = new ArrayList<>();
        appointment.add(s);
        appointment.add(s);
        Report instance = new Report();
        int expResult = 2;
        int result = instance.calculateServices(appointment, "wax");
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of calculatePrice method, of class Report.
     */
    @Test
    public void testCalculatePrice() {
        //System.out.println("calculatePrice");
        Service b = new Service("wax",125,null);
        Appointment s = new Appointment("15",b ,null,"12-12-2022");
        
        ArrayList<Service> service = new ArrayList<>();
        ArrayList<Appointment> appointment = new ArrayList<>();
        service.add(b);
        appointment.add(s);
        
        int i = 0;
        Report instance = new Report();
        double expResult = 125;
        double result = instance.calculatePrice(appointment, i, service);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
