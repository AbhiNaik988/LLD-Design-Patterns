package Design_Patterns.Behavioural_Patterns.NullObject_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("DOG");
        Animal cat = AnimalFactory.getAnimal("CAT");
        Animal tiger = AnimalFactory.getAnimal("TIGER");

        dog.say();
        cat.say();
        tiger.say();
    }
}
