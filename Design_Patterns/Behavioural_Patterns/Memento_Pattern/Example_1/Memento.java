package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_1;

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
