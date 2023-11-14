package Design_Patterns.Structural_Patterns.Bridge_Pattern;

public class FishBreathProcess implements BreathProcess{
    @Override
    public void breath() {
        System.out.println("Breaths with Gills");
    }
}
