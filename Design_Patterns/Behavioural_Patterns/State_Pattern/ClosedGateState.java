package Design_Patterns.Behavioural_Patterns.State_Pattern;

public class ClosedGateState implements State{
    private Gate gate;
    public ClosedGateState(Gate gate){
        this.gate = gate;
    }

    @Override
    public void insertToken(int token) {
        System.out.println("Token inserted..");
        this.gate.setCurrentState(new TokenInsertedState(this.gate));
    }

    @Override
    public void pressOpen(int token) {
        System.out.println("Please enter the token first!!");
    }

    @Override
    public void pressClose() {
        System.out.println("Gate is already closed!!");
    }
}
