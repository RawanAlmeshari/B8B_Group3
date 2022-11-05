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
public class userTest {
    
    public userTest() {
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
     * Test of setUserName method, of class user.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        user instance = new user();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class user.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        user instance = new user();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class user.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        int password = 0;
        user instance = new user();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNum method, of class user.
     */
    @Test
    public void testSetPhoneNum() {
        System.out.println("setPhoneNum");
        String phoneNum = "";
        user instance = new user();
        instance.setPhoneNum(phoneNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class user.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        user instance = new user();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class user.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        user instance = new user();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class user.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        user instance = new user();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class user.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        user instance = new user();
        int expResult = 0;
        int result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNum method, of class user.
     */
    @Test
    public void testGetPhoneNum() {
        System.out.println("getPhoneNum");
        user instance = new user();
        String expResult = "";
        String result = instance.getPhoneNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class user.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        user instance = new user();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
