package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_2;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<TextWindowState> states = new ArrayList<>();

    public void saveState(TextWindowState state){
        this.states.add(state);
    }

    public void undo(TextWindow window){
        if(!states.isEmpty()){
            TextWindowState state = states.remove(states.size() - 1);
            window.restore(state);
        }
    }

    public void redo(TextWindow window){
        if(!states.isEmpty()){
            TextWindowState state = states.get(states.size() - 1);
            window.restore(state);
            states.remove(states.size() - 1);
        }
    }
}
