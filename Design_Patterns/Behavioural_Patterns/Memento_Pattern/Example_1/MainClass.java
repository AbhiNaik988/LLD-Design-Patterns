package Design_Patterns.Behavioural_Patterns.Memento_Pattern.Example_1;

public class MainClass {
    public static void main(String[] args) {
        Originator originator = new Originator("abhi"); //index 0

        CareTaker careTaker = new CareTaker();
        careTaker.saveMemento(originator.saveSnapshot());

        originator.setState("abhi naik"); //index 1
        careTaker.saveMemento(originator.saveSnapshot());

        originator.setState("abhi p naik"); //index 2
        careTaker.saveMemento(originator.saveSnapshot());

        originator.setState("abhi pritesh naik"); //index 3
        careTaker.saveMemento(originator.saveSnapshot());

        System.out.println("Current State: "+originator.getState());

        originator.setSnapshot(careTaker.getMemento(0));

        System.out.println("Current State: "+originator.getState());

        originator.setSnapshot(careTaker.getMemento(1));

        System.out.println("Current State: "+originator.getState());
    }
}
