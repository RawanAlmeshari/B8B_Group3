package pkg251.group;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.Description;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(JunitTestSuite.class);
     

      
       System.out.println("------------Test Summary-------------");
       System.out.println("Total number of Test methods: "+result.getRunCount());
       int success = (result.getRunCount())-(result.getIgnoreCount()+result.getFailureCount());
       System.out.println("Total number of successed Tests methods: " +success);
       System.out.println("Total number of Ignored Tests: "+ result.getIgnoreCount());
       System.out.println("Total number of Failed Tests Methods: "+ result.getFailureCount());
       System.out.println("-------------------------------------");
       
        if (result.getFailureCount() > 0) {
            System.out.println("Failure details:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}  
