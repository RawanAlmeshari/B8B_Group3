

package pkg251.group;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
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
  
    
    
    public String getDateFormat(Date date) {
       int day =date.getDay();
        int month =  date.getMonth();
        int year = date.getYear();
        return day+"-"+month+"-"+year;
    } 
     
     
    @Override
    public String toString() {
       return "{Appointment:" + "id: " + 
                id + ", Date: " + date +
                ", chosenService: " + chosenService.getName() + ", customer: " + customer.getName() + '}';
    }
    
    
    //format for writting appointment in appointment file 
    public String fileFormat() {
        return "\n"+id+" "+chosenService.name +" "+customer.getPhoneNum()+" "+getDateFormat(date) ;
    }
    
    
    //the string on the pramater will be written on appointment file 
    public static void wirteOnFile(String whatToWrite){
        try{
            FileWriter fw = new FileWriter("appointment.txt",true); //the true will append the new data
            fw.write(whatToWrite);//appends the string to the file
            fw.close();}
        
        
        catch(IOException ioe){
           System.err.println("IOException: " + ioe.getMessage());
         }
    }
    
    public static void removeFromFile(String whatToDelete) throws FileNotFoundException, IOException{
       File inputFile = new File("appointment.txt"); 
       File tempFile = new File("myTempFile.txt"); 
 
      BufferedReader reader = new BufferedReader(new FileReader(inputFile)); 
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile)); 
 

String currentLine; 
 
while((currentLine = reader.readLine()) != null) { 
 
// trim newline when comparing with lineToRemove 
//String lineToRemove = whatToDelete; 
    String trimmedLine = currentLine.trim(); 
    
    if(trimmedLine.startsWith(whatToDelete)) continue; 
 
    writer.write(currentLine + System.getProperty("line.separator")); 
} 
      writer.close();  
      reader.close();  
 
    FileChannel src = new FileInputStream(tempFile).getChannel();
    FileChannel dest = new FileOutputStream(inputFile).getChannel();
    dest.transferFrom(src, 0, src.size());
    src.close();
    dest.close();
    tempFile.deleteOnExit();
    }
 

    

    
    
    
}
