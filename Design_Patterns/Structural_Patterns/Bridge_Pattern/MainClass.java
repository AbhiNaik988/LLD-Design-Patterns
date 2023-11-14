package Design_Patterns.Structural_Patterns.Bridge_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Human human = new Human(new HumanBreathProcess());
        Fish fish = new Fish(new FishBreathProcess());
        human.breath();
        fish.breath();
        Human human1 = new Human(new FishBreathProcess());
        human1.breath();
    }

    //In short, we have one abstract class which 'has a' one implementor interface
    //Because the class is abstract it can't be instantiate so all the children of that class would pass that implementor interface to the abstract class
    //So all the child classes will use super() to pass the concrete implementor and use super keyword to access their methods.
    //Now Abstraction and Implementation can vary independently.
    //We can create as many as abstraction children we want, and we can also create as many as implementor children we want.
}
