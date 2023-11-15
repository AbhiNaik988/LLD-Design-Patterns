package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class Car extends Vehicle{
    public Car(DriveStrategy strategy) {
        super(strategy);
    }
}
