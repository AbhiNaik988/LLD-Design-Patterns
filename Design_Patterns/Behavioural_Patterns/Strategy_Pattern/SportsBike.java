package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class SportsBike extends Vehicle{
    public SportsBike(DriveStrategy strategy) {
        super(strategy);
    }
}
