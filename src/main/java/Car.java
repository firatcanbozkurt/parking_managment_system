public class Car extends Vehicle{
    
    private double hourlyCost = 10;
    
    public Car(String pl){super(pl,"2");}
    public double charge(){
        return(hourlyCost*totalHour);
    }
}