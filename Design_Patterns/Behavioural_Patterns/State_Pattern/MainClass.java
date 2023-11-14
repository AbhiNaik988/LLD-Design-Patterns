package Design_Patterns.Behavioural_Patterns.State_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Gate gate = new Gate();
        gate.insertToken(4);
        gate.pressClose();
        gate.insertToken(5);
        gate.pressOpen(4);
        gate.insertToken(6);
        gate.pressClose();
    }
}
