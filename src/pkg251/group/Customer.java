
package pkg251.group;

public class Customer extends user{

    public Customer() {
        super();
    }

    public Customer(String userName, String name, int password, String phoneNum, String email) {
        super(userName, name, password, phoneNum, email);
    }

    //@Override
    public String toString(Customer customer) {
        return "Customer{" + "userName=" + customer.getUserName() + ", name=" + customer.getName() + ", password=" +
                customer.getPassword() + ", phoneNum=" + customer.getPhoneNum() + ", email=" + customer.getEmail() + '}';

    }
  
    
    
}
