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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        Customer customer = new Customer("bashaieriee",  "BASHAIER",6374,"0563748372","EFH@HOTMAIL.COM");
        String expResult = "Customer{userName=bashaieriee, name=BASHAIER, password=6374, phoneNum=0563748372, email=EFH@HOTMAIL.COM}";

        String result = customer.toString(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  
   
}
