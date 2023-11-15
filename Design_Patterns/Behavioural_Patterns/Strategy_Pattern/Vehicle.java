package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class Vehicle {
    private DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy strategy){
        this.driveStrategy = strategy;
    }
    void drive(){
        this.driveStrategy.drive();
    }
}
