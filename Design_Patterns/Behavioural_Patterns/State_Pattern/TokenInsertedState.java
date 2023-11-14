package Design_Patterns.Behavioural_Patterns.State_Pattern;

public class TokenInsertedState implements State{
    private Gate gate;
    private boolean isTokenValid;
    public TokenInsertedState(Gate gate){
        this.gate = gate;
    }
    @Override
    public void insertToken(int token) {
        System.out.println("Token already inserted!!");
    }

    @Override
    public void pressOpen(int token) {
        if(this.validateToken(token)){
            System.out.println("Token is valid....Opening Gate!");
            this.gate.setCurrentState(new OpenGateState(this.gate));
        }
        else{
            System.out.println("Token is invalid...Please enter the token again!");
            this.gate.setCurrentState(new ClosedGateState(this.gate));
        }
    }

    @Override
    public void pressClose() {
        System.out.println("Gate is already Closed!!");
    }

    public boolean validateToken(int token){
        return token % 2 == 0;
    }
}
