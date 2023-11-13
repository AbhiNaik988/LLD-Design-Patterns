package Design_Patterns.Creational_Patterns.Prototype_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("abhi",22);
        Person person2 = new Person("abhay",23);
        PersonRegistry.registerPerson(person1);
        PersonRegistry.registerPerson(person2);

        Person person3 = PersonRegistry.getPerson("abhi").setAge(24);
        Person person4 = PersonRegistry.getPerson("abhay").setAge(25);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
    }
    //Here we have just 2 fields that is why this is not much effective,
    //But assume if Person class have 50 fields and you want to create one another person and half of the fields are same as the first person.
    //there this design pattern has good use.
}
