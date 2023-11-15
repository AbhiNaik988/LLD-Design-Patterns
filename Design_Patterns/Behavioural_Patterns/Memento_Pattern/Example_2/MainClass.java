package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_2;

public class MainClass {
    public static void main(String[] args) {
        TextWindowState state1 = new TextWindowState("abhi naik");
        Caretaker caretaker = new Caretaker();
        caretaker.saveState(state1);
        TextWindow window = new TextWindow();

        TextWindowState state2 = new TextWindowState("abhi p naik");
        caretaker.saveState(state2);

        TextWindowState state3 = new TextWindowState("abhi pritesh naik");
        caretaker.saveState(state3);
        caretaker.redo(window);
        caretaker.redo(window);
        caretaker.redo(window);

        //undo redo is currenly not working!

    }
}
