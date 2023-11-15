package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void saveMemento(Memento memento){
        this.mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return this.mementoList.get(index);
    }
}
