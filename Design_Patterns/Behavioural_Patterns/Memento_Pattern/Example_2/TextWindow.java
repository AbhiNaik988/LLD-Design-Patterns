package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_2;

public class TextWindow {
    private StringBuilder sb;

    public TextWindowState save(){
        System.out.println(sb.toString());
        return new TextWindowState(sb.toString());
    }

    public void restore(TextWindowState state){
        sb = new StringBuilder(state.getText());
        System.out.println(sb.toString());
    }

    public void showText(){
        this.sb.toString();
    }
}
