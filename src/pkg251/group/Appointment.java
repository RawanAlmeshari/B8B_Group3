

package pkg251.group;

import java.util.*;

public final class Appointment {

    Date date = new Date();
    String id;
    Service chosenService;
    Customer customer;

    public Appointment() {
    }

    public Appointment(String id, Service chosenService, Customer customer,String date) {
        this.id = id;
        this.chosenService = chosenService;
        this.customer = customer;
        this.date = converToDate(date);
    }
    
    public Date converToDate(String date){
        String []str = date.split("-");
        Date convert=new Date();
        convert.setDate(Integer.parseInt(str[0]));
        convert.setMonth(Integer.parseInt(str[1]));
        convert.setYear(Integer.parseInt(str[2]));
        return convert;
    }

    public Date getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public Service getChosenService() {
        return chosenService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setChosenService(Service chosenService) {
        this.chosenService = chosenService;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "{Appointment:" + "date=" + 
                date + ", id: " + id +
                ", chosenService: " + chosenService.getName() + ", customer: " + customer.getName() + '}';
    }

    

    
    
    
}
