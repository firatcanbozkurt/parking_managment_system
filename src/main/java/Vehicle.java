import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;

public class Vehicle{
    private String plaque;
    public String entranceTime;
    public double totalHour;
    public String type;
    public Vehicle(){}
    
    public Vehicle(String plaque,String tp){
        this.plaque = plaque;
        this.type = tp;
       
    }
    
    
    public void entranceTime() throws FileNotFoundException{
        File f = new File("file.txt");
        Scanner in = new Scanner(f);
        while(in.hasNextLine()){
            String temp = in.nextLine();
            if(temp.equals(plaque)){
                this.entranceTime=in.nextLine();
            }
        }
        
    }
   
    public double totalHourCalc(){
        LocalDateTime now = LocalDateTime.now();
        String nowString = now.toString();
        int hour = Integer.parseInt(nowString.substring(11,13));
        double minToHour = Double.parseDouble(nowString.substring(14,16))/60;
        int hourE = Integer.parseInt(entranceTime.substring(11,13));
        double minToHourE = Double.parseDouble(entranceTime.substring(14,16))/60;
        
        this.totalHour = (double)Math.abs((hour+(int)minToHour)-(hourE+(int)minToHourE));
        return totalHour;
    }
    
}