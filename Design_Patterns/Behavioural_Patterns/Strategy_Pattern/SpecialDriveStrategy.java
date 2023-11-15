package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive...");
    }
}
