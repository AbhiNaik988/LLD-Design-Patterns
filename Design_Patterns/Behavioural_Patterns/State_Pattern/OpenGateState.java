package Design_Patterns.Behavioural_Patterns.State_Pattern;

public class OpenGateState implements State{
    private Gate gate;
    public OpenGateState(Gate gate){
        this.gate = gate;
    }
    @Override
    public void insertToken(int token) {
        System.out.println("Gate is already opened, try after the gate closes!");
    }

    @Override
    public void pressOpen(int token) {
        System.out.println("Gate is already opened!");
    }

    @Override
    public void pressClose() {
        System.out.println("Closing the gates...");
        this.gate.setCurrentState(new ClosedGateState(this.gate));
    }
}
