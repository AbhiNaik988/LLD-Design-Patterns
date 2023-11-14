package Design_Patterns.Structural_Patterns.Bridge_Pattern;

public class Human extends LivingThings{
    public Human(BreathProcess breathProcess) {
        super(breathProcess);
    }

    public void breath(){
        super.breath();
    }
}
