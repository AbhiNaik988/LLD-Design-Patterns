package Design_Patterns.Behavioural_Patterns.NullObject_Pattern;

public class Cat extends Animal{
    public Cat(){
        System.out.println("Cat Created!");
    }

    @Override
    public void say() {
        System.out.println("Meow.....");
    }
}
