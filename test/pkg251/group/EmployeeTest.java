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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getSalary method, of class Employee.
     */
    


    public void testSetSalary(double salary) {
     
    }
    @Test
    public void testGetSalary() {
        //System.out.println("getSalary");
        Employee instance = new Employee("gadah","ghadah", 1234, "0593480888", "ghadahsultan75@gmail.com",200000);
        double expResult = 200000;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class Employee.
     */
    @Test
    public void testSetSalary() {
      //  System.out.println("setSalary");
        double salary = 2500000;
        double expResult =2500000 ;
        Employee instance = new Employee("gadah","ghadah", 1234, "0593480888", "ghadahsultan75@gmail.com",200000);
        instance.setSalary(salary);
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        //System.out.println("toString");
        Employee employee = new Employee("gadah","ghadah", 1234, "0593480888", "ghadahsultan75@gmail.com",200000);
        String expResult = "Employee{userName=gadah, name=ghadah, password=1234,"
                + " phoneNum=0593480888, email=ghadahsultan75@gmail.com, salary=200000.0}";
        String result = employee.toString(employee);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
