package Design_Patterns.Creational_Patterns.Prototype_Pattern;

public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    protected Person clone() {
        return new Person(this.name,this.age);
    }

    @Override
    public String toString() {
        return "[ "+this.name+", "+this.age+" ]";
    }
}
