package Design_Patterns.Structural_Patterns.Bridge_Pattern;

public class Fish extends LivingThings{
    public Fish(BreathProcess breathProcess) {
        super(breathProcess);
    }

    public void breath(){
        super.breath();
    }
}
