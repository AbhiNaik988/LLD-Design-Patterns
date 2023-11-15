package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_2;

public class TextWindowState {
    private String text;

    public TextWindowState(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
