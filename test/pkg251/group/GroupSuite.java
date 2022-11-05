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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Lenovo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({pkg251.group.WorkerTest.class, pkg251.group.AppointmentTest.class, pkg251.group.CustomerTest.class, pkg251.group.ServiceTest.class, pkg251.group.EmployeeTest.class, pkg251.group.ManagerTest.class, pkg251.group.MainTest.class, pkg251.group.userTest.class, pkg251.group.ReportTest.class})
public class GroupSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
