package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive...");
    }
}
