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
        //System.out.println("setUserName");
        String userName = "gado";
        String expResult ="gado" ;

        user instance = new user("ghadah","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        instance.setUserName(userName);
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setName method, of class user.
     */
    @Test
    public void testSetName() {
      //  System.out.println("setName");
        String name= "gado";
        String expResult ="gado" ;
        user instance = new user("ghadah","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        instance.setName(name);
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class user.
     */
    @Test
    public void testSetPassword() {
      //  System.out.println("setPassword");
        int password = 2222;
        int expResult = 2222;
        user instance = new user("ghadah","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        instance.setPassword(password);
        int result = instance.getPassword();
         assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setPhoneNum method, of class user.
     */
    @Test
    public void testSetPhoneNum() {
       // System.out.println("setPhoneNum");
        String phoneNum = "0591111111";
        String expResult = "0591111111";
        user instance = new user("ghadah","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        instance.setPhoneNum(phoneNum);
         String result = instance.getPhoneNum();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setEmail method, of class user.
     */
    @Test
    public void testSetEmail() {
        //System.out.println("setEmail");
        String email = "ghadah@gmail.com";
        String  expResult= "ghadah@gmail.com";
        user instance = new user("ghadah","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        instance.setEmail(email);
         String result = instance.getEmail();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getUserName method, of class user.
     */
    @Test
    public void testGetUserName() {
       // System.out.println("getUserName");
        user instance = new user("gadoo","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        String expResult = "gadoo";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class user.
     */
    @Test
    public void testGetName() {
       // System.out.println("getName");
        user instance = new user("gadoo","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        String expResult = "ghadah";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class user.
     */
    @Test
    public void testGetPassword() {
       // System.out.println("getPassword");
        user instance = new user("gadoo","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        int expResult = 1234;
        int result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPhoneNum method, of class user.
     */
    @Test
    public void testGetPhoneNum() {
       // System.out.println("getPhoneNum");
        user instance = new user("gadoo","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        String expResult = "0593480888";
        String result = instance.getPhoneNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmail method, of class user.
     */
    @Test
    public void testGetEmail() {
       // System.out.println("getEmail");
        user instance = new user("gadoo","ghadah",1234,"0593480888","gadahAlmuaikel@gmail.com");
        String expResult = "gadahAlmuaikel@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
