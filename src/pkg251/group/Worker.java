/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.group;

/**
 *
 * @author earth
 */
public class Worker extends Employee{

    public Worker() {
    }

    public Worker(String userName, String name, int password, String phoneNum, String email,double salary) {
        super(userName, name, password, phoneNum, email,salary);
    }

    public String toString(Worker employee) {
        return "Employee{" + "userName=" + employee.getUserName() + ", name=" + employee.getName()
                + ", password=" + employee.getPassword() + ", phoneNum=" + employee.getPhoneNum()
                + ", email=" + employee.getEmail() +  " salary=" + employee.getSalary() + '}';
    }
    
}
