package pkg251.group;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author earth
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(JunitTestSuite.class);

       System.out.println("------------Test Summary-------------");
       System.out.println("Total number of Test methods: "+result.getRunCount());
       System.out.println("Total number of Ignored Tests: "+ result.getIgnoreCount());
       System.out.println("Total number of Failed Tests Methods: "+ result.getFailureCount());
       System.out.println("-------------------------------------");
       System.out.println("Failure details:");
     //  System.out.println(result.getFailures().toString());
     for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }		
     // System.out.println(result.wasSuccessful());*/
   }
}  
