package Design_Patterns.Behavioural_Patterns.NullObject_Pattern;

public class AnimalFactory {
    public static Animal getAnimal(String cond){
        switch (cond){
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
        }
        return new NullAnimal();
    }
}
