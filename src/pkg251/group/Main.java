package pkg251.group;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {

    //staric varibles 
    static ArrayList<Customer> customer;
    static int appointmentsID = 0;
    static ArrayList<Service> service;
    static ArrayList<Appointment> appointment;
    static ArrayList<Manager> manager;
    static ArrayList<Worker> worker;
    static Scanner input = new Scanner(System.in);
    static Scanner input2 = new Scanner(System.in);
    
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
        customer = storeCustomer(new File("customers.txt"));
        worker = new ArrayList<>();
        manager = new ArrayList<>();
        storeEmployee(new File("workerInfo.txt"));
        service = new ArrayList<>();
        storeServices(new File("Services.txt"));
        appointment = new ArrayList<>();
        storeAppointment(new File("appointment.txt"));
        
        int choice = 0;
        do {
            menu();
            choice = input2.nextInt();
            
            if (choice == 1) {
                Book();
            } else if (choice == 2) {
                cancelAppointmrnt();
            } else if (choice == 3) {
                
            } else if (choice == 4) {
                generateReport();
                System.exit(0);
            } else if (choice == 5) {
                int show = 0;
                do {
                    showOptions();
                    show = input2.nextInt();
                    if (show == 1) {
                        for (int i = 0; i < customer.size(); i++) {
                            if (!customer.get(i).getName().isEmpty()) {
                                System.out.println(customer.get(i).toString(customer.get(i)));
                            }
                        }
                    } else if (show == 2) {
                        for (int i = 0; i < manager.size(); i++) {
                            if (!manager.get(i).getName().isEmpty()) {
                                System.out.println(manager.get(i).toString(manager.get(i)));
                            }
                            
                        }
                        
                    } else if (show == 3) {
                        for (int i = 0; i < worker.size(); i++) {
                            if (!worker.get(i).getName().isEmpty()) {
                                System.out.println(worker.get(i).toString(worker.get(i)));
                            }
                            
                        }
                        
                    } else if (show == 4) {
                        for (int i = 0; i < service.size(); i++) {
                            if (!service.get(i).getName().isEmpty()) {
                                System.out.println(service.get(i).toString(service.get(i)));
                            }
                            
                        }
                    } else if (show == 5) {
                        for (int i = 0; i < appointment.size(); i++) {
                            if (!appointment.get(i).getId().isEmpty()) {
                                System.out.println(appointment.get(i).toString());
                            }
                        }
                    } else if (show == 6) {
                        break;
                    } else {
                        System.out.print("Wronge Choice, Enter your choice again:");
                        show = input2.nextInt();
                    }
                    
                } while (true);
                
            } else if (choice == 6) {
                System.exit(0);
            } else {
                System.out.print("Wronge Choice, Enter your choice again:");
                choice = input2.nextInt();
            }
            
        } while (true);
    }

    // book an appointment
    public static void Book() throws ParseException {
        Scanner input3 = new Scanner(System.in);
        System.out.print("enter your phone number: ");
        String phoneNum = input3.next();
        int doesExist = searchPhoneNum(phoneNum);
        if (doesExist == -1) {
            System.out.println("\nthere's no customer assigned to this number\n\n");
        } else {
            servicesMenu();
            int serviceID = input3.nextInt();
            while (serviceID == -1) {
                System.out.println("choose number from the menu pleas :)");
                
                servicesMenu();
                serviceID = input3.nextInt();
            }
            Service choosenservise = service.get(serviceID - 1);
            System.out.print("Enter the date of service as day-month-year: ");
            String date = input3.next();
            while (!date.matches("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((202)[1-9])")) {
                System.out.print("try again and follow the format: ");
                date = input3.next();
            }
            Appointment thisAppointment = new Appointment(Integer.toString(appointmentsID), choosenservise, customer.get(doesExist), date);
            
            appointment.add(thisAppointment);
            thisAppointment.wirteOnFile(thisAppointment.fileFormat());
            appointmentsID++;
            System.out.println("\n THANK YOU ");
        }
    }

    //cancel an appointment 
    public static void cancelAppointmrnt() throws IOException {
        
        System.out.print("what is your phone number? ");
        String number = input2.next();
        int check = searchPhoneNum(number);
        if (check != -1) {
            String appAssign = appointmentsAssign(number);
            System.out.println("\n\n" + appAssign);
            if (!appAssign.equalsIgnoreCase("sorry there is no appointemnst assign to this number")) {
                System.out.print("What is teh ID of appointment you want to canceal? ");
                String id = input2.next();
                int index = searchID(id);
                if (index == -1) {
                    System.out.println("\nThere is no appointment with id=" + id + " in the system");
                } else {
                    Appointment.removeFromFile(String.valueOf(id));
                    appointment.remove(appointment.get(index));
                    System.out.println("\nthe appointment has been deleted.");
                }
            }
        } else {
            System.out.println("\n\n there's not recored for this number sorry");
        }
        
    }

    //menu for show details 
    public static void showOptions() {
        
        System.out.print("1. Show customers.\n"
                + "2. show Managers.\n"
                + "3. show workers.\n"
                + "4. show services.\n"
                + "5. show appointments.\n"
                + "6. Back to menu.\n"
                + "What do you want to show: ");
        
    }

    // service menu 
    public static void servicesMenu() {
        
        System.out.print("1.hairCut \n"
                + "2.Pedicure  \n"
                + "3.manicure\n "
                + "4.makeUp  \n"
                + "5.Wax \n"
                + "6.hairDry \n"
                + "Your Choice: ");
        
    }

    // main menu 
    public static void menu() {
        System.out.println("\n----------------------------------------------\n"
                + "---------WELCOME TO LOTUS SALON---------------\n"
                + "----------------------------------------------");
        System.out.print("1. Book An Appointment. \n"
                + "2. Cancel An Appointment. \n"
                + "3. Print Work Schedule. \n"
                + "4. Generate Report. \n"
                + "5. show details\n"
                + "6. Exit. \n"
                + "Your Choice: ");
        
    }

    //stroe employee from file to arraylists depend on wheter they are worker or manger
    public static void storeEmployee(File file) throws FileNotFoundException {
        
        input = new Scanner(file);
        
        if (file.exists()) {
            while (input.hasNext()) {
                String type = input.next();
                if (type.equalsIgnoreCase("manager")) {
                    manager.add(new Manager(input.next(), input.next(), input.nextInt(), input.next(),
                            input.next(), input.nextDouble()));
                    
                } else {
                    worker.add(new Worker(input.next(), input.next(), input.nextInt(), input.next(),
                            input.next(), input.nextDouble()));
                    //  System.out.println(worker.get(i++).getName());

                }
            }
        }
    }

    //store servcies from file to array list
    public static void storeServices(File file) throws FileNotFoundException {
        input = new Scanner(file);
        if (file.exists()) {
            while (input.hasNext()) {
                String name = input.next();
                double price = input.nextDouble();
                String name2 = input.next();
                int work = searchWorker(name2);
                if (work != -1) {
                    service.add(new Service(name, price, worker.get(work)));
                } else {
                    System.out.println("There is no " + name2 + " works here ");
                }
            }
        }
        
    }

    //store Customers from file to array list 
    public static ArrayList<Customer> storeCustomer(File file) throws FileNotFoundException {
        input = new Scanner(file);
        ArrayList<Customer> customer = new ArrayList<>();
        
        if (file.exists()) {
            while (input.hasNext()) {
                customer.add(new Customer(input.next(), input.next(), input.nextInt(), input.next(), input.next()));
                
            }
        }
        return customer;
    }

    //store appointments on file to array list
    public static void storeAppointment(File file) throws FileNotFoundException {
        input = new Scanner(file);
        String id = "";
        if (file.exists()) {
            while (input.hasNext()) {
                id = input.next();
                String servic = input.next();
                int index = searchService(servic);
                String phone = input.next();
                int index2 = searchPhoneNum(phone);
                if (index == -1) {
                    System.out.println("There is no " + servic + " Here ");
                } else if (index2 == -1) {
                    System.out.println("There is no " + phone + " stored here");
                } else {
                    appointment.add(new Appointment(id, service.get(index), customer.get(index2), input.next()));
                }
                
            }
            appointmentsID = Integer.parseInt(id) + 1;
        }
        
    }

    //search in worker arraylist for worker name and return its index if exists else -1
    public static int searchWorker(String name) {
        for (int i = 0; i < worker.size(); i++) {
            if (!worker.get(i).getName().isEmpty()) {
                if (worker.get(i).getName().equalsIgnoreCase(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //search in customer arraylist for phone number and return its index if exists else -1
    public static int searchPhoneNum(String phone) {
        
        for (int i = 0; i < customer.size(); i++) {
            if (!customer.get(i).getPhoneNum().isEmpty()) {
                if (customer.get(i).getPhoneNum().equalsIgnoreCase(phone)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //search in services arraylist for service and return its index if exists else -1
    public static int searchService(String name) {
        for (int i = 0; i < service.size(); i++) {
            if (!service.get(i).getName().isEmpty()) {
                if ((service.get(i).name.equalsIgnoreCase(name))) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static int searchID(String id) {
        for (int i = 0; i < appointment.size(); i++) {
            if (!appointment.get(i).getId().isEmpty()) {
                if (appointment.get(i).getId().equalsIgnoreCase(id)) {
                    return i;
                }
            }
            
        }
        return -1;
    }
    
    public static String appointmentsAssign(String phone) {
        String app = "";
        for (int i = 0; i < appointment.size(); i++) {
            if (!appointment.get(i).getCustomer().getPhoneNum().isEmpty()) {
                if (appointment.get(i).getCustomer().getPhoneNum().equalsIgnoreCase(phone)) {
                    app += appointment.get(i).fileFormat() + "\n";
                }
            }
        }
        if (!app.isEmpty()) {
            return app;
        }
        return "sorry there is no appointemnst assign to this number";
    }
    
    public static void generateReport() {
        System.out.println("============================================");
        System.out.println("\tWeekly Report For Louts Salon\n"
                + "============================================");
        System.out.println("\nManager Of the Salon: " + manager.get(0).getName() + "\n");
        System.out.println("Total Appointment: " + appointment.size());
        dashes();
        System.out.println("    Service\t\t Price\t\t Worker");
        dashes();
        for (int i = 0; i < service.size(); i++) {
            if (!service.get(i).getName().isEmpty()) {
                System.out.println((i + 1) + ".  " + service.get(i).getName() + "\t\t" + service.get(i).getPrice() + "SAR\t\t" + service.get(i).getDoneBy().getName());
            }
        }
        dashes();
        Report report = new Report();
        System.out.println("");
        dashes();
        System.out.println("\tService\t\t Reservation\t\t Price\t\t");
        dashes();
        for (int i = 0; i < service.size(); i++) {
            System.out.println(service.get(i).getName() + "\t\t"+ report.calculateServices(appointment, service.get(i).getName())+"\t\t"+report.calculatePrice(appointment, i, service)+"SAR");
        }
        System.out.println("");
        dashes();
        System.out.println("Total income form Appointments: " + report.calculateIncome(appointment) +"SAR");
        dashes();
    }
    
    public static void dashes() {
        System.out.println("--------------------------------------------------------");
    }
}
