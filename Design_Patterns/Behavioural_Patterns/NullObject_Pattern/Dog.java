package Design_Patterns.Behavioural_Patterns.NullObject_Pattern;

public class Dog extends  Animal{
    public Dog(){
        System.out.println("Dog Created!");
    }

    @Override
    public void say() {
        System.out.println("Woof....");
    }
}
