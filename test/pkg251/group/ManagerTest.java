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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of toString method, of class Manager.
     */
    @Test
    public void testToString() {
        Manager employee = new Manager ( "bashaieriee",  "BASHAIER",6374,"0563748372","EFH@HOTMAIL.COM",6534.3);
        String result = employee.toString(employee);
        
        String expected = "Employee{userName=bashaieriee, name=BASHAIER, password=6374"
                + ", phoneNum=0563748372, email=EFH@HOTMAIL.COM salary=6534.3}";
        
        assertEquals(expected, result);
        
    }
    
}
