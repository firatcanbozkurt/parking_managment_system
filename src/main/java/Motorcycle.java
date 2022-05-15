public class Motorcycle extends Vehicle{
    
    private double hourlyCost = 5;
    
    public Motorcycle(String pl){super(pl,"3");}
    public double charge(){
        return(hourlyCost*totalHour);
    }
    
}