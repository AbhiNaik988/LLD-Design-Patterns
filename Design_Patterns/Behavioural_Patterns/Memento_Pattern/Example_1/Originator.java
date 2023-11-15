package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_1;

public class Originator {
    private String state;

    public Originator(String state){
        this.state = state;
    }

    public Memento saveSnapshot(){
        return new Memento(this.state);
    }

    public void setSnapshot(Memento memento){
        this.state = memento.getState();
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
