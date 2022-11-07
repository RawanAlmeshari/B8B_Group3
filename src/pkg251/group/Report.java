package pkg251.group;

import java.util.ArrayList;

public class Report extends Manager {

    ArrayList<Appointment> appointment;
    ArrayList<Service> service;

    public int calculateIncome(ArrayList<Appointment> appointment) {
        int sum = 0;
        for (int i = 0; i < appointment.size(); i++) {
            sum += appointment.get(i).getChosenService().getPrice();
        }
        return sum;
    }

    public int calculateServices(ArrayList<Appointment> appointment, String service) {
        int ServiceNum = 0;
        for (int i = 0; i < appointment.size(); i++) {
            if (appointment.get(i).getChosenService().getName().equalsIgnoreCase(service)) {
                ServiceNum += 1;
            } 
        }
        return ServiceNum;
    }

    public double calculatePrice(ArrayList<Appointment> appointment, int i, ArrayList<Service> service) {
        return service.get(i).getPrice() * calculateServices(appointment, service.get(i).getName());
    }
}
