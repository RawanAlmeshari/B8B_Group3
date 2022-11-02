package pkg251.group;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {

    //staric varibles 
    static ArrayList<Customer> customer ;
    static int appointmentsID=0;
    static ArrayList<Service> service;
    static  ArrayList <Appointment > appointment ;
    static ArrayList<Manager> manager ;
    static ArrayList<Worker> worker ;
    
    
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(System.in);
        customer =  storeCustomer(new File("customers.txt"),input);
        worker = new ArrayList<>();
        manager = new ArrayList<>();
        storeEmployee(new File("workerInfo.txt"),input);
        service = new ArrayList<>();
        storeServices(new File("Services.txt"),  input);
        appointment = new ArrayList<>();
        storeAppointment(new File("appointment.txt"),input);
        
        
        Scanner input2 = new Scanner(System.in);
                

        int choice = 0;
        do {
            menu();
            choice = input2.nextInt();
            
            if (choice==1 ){
                Book();
            }
            else if (choice ==2){
                cancel();
            }
            else if (choice==3){
                
            }
            else if (choice ==4){
                
            }
            
            else if (choice==5){
                int show = 0;
                do{
                    showOptions();
                    show = input2.nextInt();
                    if (show ==1){
                        for (int i = 0; i < customer.size(); i++) {
                            //System.out.println(customer.get(i).toString());
                            System.out.println(customer.get(i).toString(customer.get(i)));
                        }
                    }
                    else if (show==2){
                        for (int i = 0; i < manager.size(); i++) {
                            System.out.println(manager.get(i).toString(manager.get(i)));
                            
                        }
                     
                    }else if (show==3){
                        for (int i = 0; i < worker.size(); i++) {
                            
                            System.out.println(worker.get(i).toString(worker.get(i)));
                            
                        }
                
                    }else if (show==4){
                        for (int i = 0; i < service.size(); i++) {
                            System.out.println(service.get(i).toString(service.get(i)));
                            
                        }
                    }else if (show==5){
                        for (int i = 0; i < appointment.size(); i++) {
                            System.out.println(appointment.get(i).toString());
                        }
                    }else if (show==6){
                        break;
                    }else{
                        System.out.print("Wronge Choice, Enter your choice again:");
                show=input2.nextInt();
                    }
                   
                    
                }while (true);
                
            }
            else if(choice==6){
               System.exit(0);
            }
            
            else {
                System.out.print("Wronge Choice, Enter your choice again:");
                choice=input2.nextInt();
            }
                

        } while (true);
    }

    
    

    public static void Book() throws ParseException{
        Scanner input3 = new Scanner(System.in);
        System.out.print("enter your phone number: ");
        String phoneNum = input3.next();
        int doesExist= searchPhoneNum(phoneNum);
        if(doesExist==-1){
            System.out.println("\nthere's no customer assign to this number\n\n");
        }
         
        else{
            servicesMenu();
            int serviceID = input3.nextInt();           
            while(serviceID==-1){
                System.out.println("choose number from the menu pleas :)");
                  
            servicesMenu();
            serviceID = input3.nextInt();
            }
            Service choosenservise=service.get(serviceID-1);
            System.out.print("Enter the date of service as day-month-year: ");
            String date = input3.next(); 
            while(!date.matches("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((202)[1-9])")){
                System.out.print("try again and follow the format: ");
                date = input3.next();
            }
             Appointment thisAppointment =new Appointment(Integer.toString(appointmentsID),choosenservise,customer.get(doesExist),date);
             
            appointment.add(thisAppointment);
            thisAppointment.wirteOnFile(thisAppointment.fileFormat());
            appointmentsID++;
            System.out.println("\n THANK YOU ");
        }
         
    }
    
    
    
    public static void cancel(){
        
    }
    public static void showOptions(){ 

        System.out.print("1. Show customers.\n"
                + "2. show Managers.\n"
                + "3. show workers.\n"
                + "4. show services.\n"
                + "5. show appointments.\n"
                + "6. Back to menu.\n"
                + "What do you want to show: ");
        
    }
    
    
    public static void servicesMenu(){
       
        System.out.print("1.hairCut \n"
                         + "2.Pedicure  \n"
                         + "3.manicure\n "
                         + "4.makeUp  \n"
                         + "5.Wax \n"
                         + "6.hairDry \n"
                         + "Your Choice: ");
        
    }
    
    public static void menu(){
        System.out.println("\n----------------------------------------------\n"
                         + "---------WELCOME TO LOTUS SALON---------------\n"+
                           "----------------------------------------------");
        System.out.print("1. Book An Appointment. \n"
                         + "2. Cancel An Appointment. \n"
                         + "3. Print Work Schedule. \n "
                         + "4. Generate Report. \n"
                         + "5. show details\n"
                         + "6. Exit. \n"
                         + "Your Choice: ");
        
    }
    
    
    //stroe employee from file to arraylists depend on wheter they are worker or manger
    public static void storeEmployee(File file, Scanner input) throws FileNotFoundException {
        
        input = new Scanner (file);

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
                
            }}}
        }

    
    //store servcies from file to array list
    public static void storeServices(File file, Scanner input) throws FileNotFoundException {
        input = new Scanner (file );
        if (file.exists()) {
            while (input.hasNext()) {
                String name = input.next();
                double price = input.nextDouble();
                String name2 = input.next();
                int work = searchWorker(name2 );
                if (work!=-1)
                service.add(new Service(name, price, worker.get(work)));
                else 
                    System.out.println("There is no "+name2+" works here ");
            }
        }

    }
    
    
    
    public static ArrayList<Customer> storeCustomer(File file, Scanner input) throws FileNotFoundException {
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
    public static void storeAppointment(File file, Scanner input) throws FileNotFoundException {
        input = new Scanner(file);
        String id="";
        if (file.exists()) {
            while (input.hasNext()) {
                id = input.next();
                int index = searchService(input.next());
                int index2 = searchPhoneNum(input.next());
                appointment.add(new Appointment(id,service.get(index),customer.get(index2),input.next()));
                
            }
            appointmentsID =Integer.parseInt(id)+1; 
        }
        
        
    }
    
    
    //search in worker arraylist for worker name and return its index if exists else -1
    public static int searchWorker(String name){
        for (int i = 0; i < worker.size(); i++) {
            if(worker.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    
    //search in customer arraylist for phone number and return its index if exists else -1
    public static int searchPhoneNum(String phone ){
        
        for (int i = 0; i < customer.size(); i++) {
            if(customer.get(i).getPhoneNum().equalsIgnoreCase(phone)){
                return i;
            }
        }
        return -1;
    }
    
    //search in services arraylist for service and return its index if exists else -1
    public static int searchService(String name ){
        for (int i = 0; i < service.size(); i++) {
            if(service.get(i).name.equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
        
            
        }
   




