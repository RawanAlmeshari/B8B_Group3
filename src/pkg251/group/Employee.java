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
public class Employee extends user {
    private double salary;

    public Employee() {
        super();
    }
    

    public Employee(String userName, String name, int password, String phoneNum, String email,double salary ) {
        super(userName, name, password, phoneNum, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   // @Override
    public String toString(Employee employee) {
        return "Employee{userName=" + employee.getUserName() + ", name=" + employee.getName()
                + ", password=" + employee.getPassword() + ", phoneNum=" + employee.getPhoneNum()
                + ", email=" + employee.getEmail() +  ", salary=" + employee.getSalary()+"}";
    }
    

    
    
}
