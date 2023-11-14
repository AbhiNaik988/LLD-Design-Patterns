package Design_Patterns.Behavioural_Patterns.NullObject_Pattern;

public class NullAnimal extends Animal{
    public NullAnimal(){
        System.out.println("Null Animal Created");
    }

    @Override
    public void say() {
        System.out.println("Animal Not Defined!");
    }
}
