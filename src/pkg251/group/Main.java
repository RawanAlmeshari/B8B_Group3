package pkg251.group;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File();
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customer =  storeCustomer(new File("customers.txt"),input);
       
        

        

      //  file = new File("workerInfo.txt");
        //input = new Scanner(file);
        ArrayList<Worker> worker = new ArrayList<>();
        ArrayList<Manager> manager = new ArrayList<>();
        storeEmployee(new File("workerInfo.txt"),input,manager,worker);
        

        ArrayList<Service> service = new ArrayList<>();
        storeServices(new File("Services.txt"),  input, service, worker);
        //file = new File("Services");
        //input = new Scanner(file);
        
        ArrayList <Appointment > appointment = new ArrayList<>();
        
        storeAppointment(new File("appointment.txt"),input,appointment,customer,service);
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
                    menu2();
                    show = input2.nextInt();
                    if (show ==1 ){
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
            else {
                System.out.print("Wronge Choice, Enter your choice again:");
                choice=input2.nextInt();
            }
                

        } while (true);
    }


    public static void Book(){
        
    }
    public static void cancel(){
        
    }
    public static void menu2(){ 
        System.out.println("----------------------------------------------\n"
                         + "---------WELCOME TO LOTUS SALON---------------\n"+
                           "----------------------------------------------");
        System.out.print("1. Show customers.\n"
                + "2. show Managers.\n"
                + "3. show workers.\n"
                + "4. show services.\n"
                + "5. show appointments.\n"
                + "6. Back to menu.\n"
                + "What do you want to show: ");
        
    }
    
    public static void menu(){
       
        System.out.print("1. Book An Appointment. \n"
                         + "2. Cancel An Appointment. \n"
                         + "3. Print Work Schedule. \n "
                         + "4. Generate Report. \n"
                         + "5. show details\n"
                         + "6. Exit. \n"
                         + "Your Choice: ");
        
    }
        public static void storeEmployee(File file, Scanner input, ArrayList<Manager> manager, ArrayList<Worker> worker) throws FileNotFoundException {
        
            input = new Scanner (file);
              //                  int i =0;

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

    public static void storeServices(File file, Scanner input, ArrayList<Service> array, ArrayList<Worker> worker) throws FileNotFoundException {
        input = new Scanner (file );
        if (file.exists()) {
            while (input.hasNext()) {
                String name = input.next();
                double price = input.nextDouble();
                String name2 = input.next();
                int work = searchWorker(worker,name2 );
                if (work!=-1)
                array.add(new Service(name, price, worker.get(work)));
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
    public static void storeAppointment(File file, Scanner input, ArrayList<Appointment> array
            ,ArrayList<Customer>customer,ArrayList<Service>service) throws FileNotFoundException {
        input = new Scanner(file);
        if (file.exists()) {
            while (input.hasNext()) {
                String id = input.next();
                int index = searchService(service,input.next());
                int index2 = searchPhoneNum(customer,input.next());
                array.add(new Appointment(id,service.get(index),customer.get(index2),input.next()));
                
            }
        }
        
        
    }
    public static int searchWorker(ArrayList <Worker>worker, String name){
        for (int i = 0; i < worker.size(); i++) {
            if(worker.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public static int searchPhoneNum(ArrayList<Customer> customer, String phone ){
        
        for (int i = 0; i < customer.size(); i++) {
            if(customer.get(i).getPhoneNum().equalsIgnoreCase(phone)){
                return i;
            }
        }
        return -1;
    }
    public static int searchService(ArrayList<Service>service, String name ){
        for (int i = 0; i < service.size(); i++) {
            if(service.get(i).name.equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
        
            
        }
   




