
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
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of getName method, of class Service.
     */
    @Test
    public void testGetName() {
        Service service = new Service("HairCut",150.0,null);
        String result  = service.getName();
        String expResult = "HairCut";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Service.
     */
    @Test
    public void testGetPrice() {
        Service service = new Service("HairCut",150.0,null);
        double result = service.getPrice();
        double expResult = 150.0;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDoneBy method, of class Service.
     */
    @Test
    public void testGetDoneBy() {
        Worker doneBy = new Worker("Bashaieriee", "BASHAIER", 7364, "0536473736", "nfke@fkeok.com", 3664.0);

        Service service = new Service("HairCut", 150.0, doneBy);

        String expResult = "BASHAIER";
        String result = service.getDoneBy().getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Service.
     */
    @Test
    public void testSetName() {
        //System.out.println("setName");
        Service service = new Service();
        service.setName("HairCut");
        String name = "HairCut";
        String result = service.getName();
        assertEquals(name, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Service.
     */
    @Test
    public void testSetPrice() {
        //(String name, double price, Worker doneBy)
        Service service = new Service() ;
        service.setPrice(150.0);
        double expected = 150.0;
        double result = service.getPrice();
        assertEquals(expected, result,0);
    }

    /**
     * Test of setDoneBy method, of class Service.
     */
    @Test
    public void testSetDoneBy() {
      //  System.out.println("setDoneBy");
      // (String userName, String name, int password, String phoneNum, String email,double salary)
        Worker doneBy = new Worker ("Bashaieriee","BASHAIER",7364,"0536473736","nfke@fkeok.com",3664.0);
        String result = doneBy.getName();
        String expected = "BASHAIER";
        assertEquals(result,expected);
    }

    /**
     * Test of toString method, of class Service.
     */
    
    @Test
    public void testToString() {
        Worker doneBy = new Worker("Bashaieriee", "BASHAIER", 7364, "0536473736", "nfke@fkeok.com", 3664.0);
        Service service = new Service("HairCut", 150.0, doneBy);
        
        String expResult = "Service{name=" + service.getName() + ", price=" + 
                service.getPrice() + ", doneBy=" + service.getDoneBy().getName() +"}";
        
        String result = "Service{name=HairCut, price=150.0, doneBy=BASHAIER}";
        assertEquals(expResult, result);
      
    }
    
}
