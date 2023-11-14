package Design_Patterns.Behavioural_Patterns.State_Pattern;

public class Gate {
    private ClosedGateState closedGateState;
    private TokenInsertedState tokenInsertedState;
    private OpenGateState openGateState;
    private State currentState;

    public Gate(){
        this.closedGateState = new ClosedGateState(this);
        this.tokenInsertedState = new TokenInsertedState(this);
        this.openGateState = new OpenGateState(this);
        this.currentState = closedGateState;
    }

    public void insertToken(int token){
        this.currentState.insertToken(token);
    }

    public void pressOpen(int token){
        this.currentState.pressOpen(token);
    }

    public void pressClose(){
        this.currentState.pressClose();
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public State getCurrentState(){
        return this.currentState;
    }
}
