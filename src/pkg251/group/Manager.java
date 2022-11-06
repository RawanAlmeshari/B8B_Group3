
package pkg251.group;

public class Manager extends Employee{

    public Manager() {
    }

    public Manager(String userName, String name, int password, String phoneNum, String email,double salary) {
        super(userName, name, password, phoneNum, email,salary);
    }

   // @Override
    public String toString(Manager employee) {
        return "Employee{" + "userName=" + employee.getUserName() + ", name=" + employee.getName()
                + ", password=" + employee.getPassword() + ", phoneNum=" + employee.getPhoneNum()
                + ", email=" + employee.getEmail() +  " salary=" + employee.getSalary() + '}';
    }
    
    
    
}
