package Design_Patterns.Creational_Patterns.Object_Pool_Pattern;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "[ "+this.name+", "+this.breed+" ]";
    }
}
