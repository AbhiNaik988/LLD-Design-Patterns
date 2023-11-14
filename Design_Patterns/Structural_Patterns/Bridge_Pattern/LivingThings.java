package Design_Patterns.Structural_Patterns.Bridge_Pattern;

public abstract class LivingThings {
    private BreathProcess breathProcess;
    public LivingThings(BreathProcess breathProcess){
        this.breathProcess = breathProcess;
    }

    public void breath(){
        this.breathProcess.breath();
    }
}
