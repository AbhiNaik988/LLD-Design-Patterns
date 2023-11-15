package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class MountainTruck extends Vehicle{
    public MountainTruck(DriveStrategy strategy) {
        super(strategy);
    }
}
