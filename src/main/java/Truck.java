public class Truck extends Vehicle{
    private final double hourlyCost = 20;
    
    public Truck(String pl){super(pl,"1");}
    public double charge(){
        return(hourlyCost*totalHour);
    }
}