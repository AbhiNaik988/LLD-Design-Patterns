package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class Bus extends Vehicle{
    public Bus(DriveStrategy strategy) {
        super(strategy);
    }
}
