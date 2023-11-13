package Design_Patterns.Creational_Patterns.Prototype_Pattern;

import java.util.HashMap;
import java.util.Map;

public class PersonRegistry {
    private static Map<String,Person> persons = new HashMap<>();

    public static Person getPerson(String name){
        return persons.get(name).clone();
    }

    public static void registerPerson(Person person) {
        persons.put(person.getName(), person);
    }
}
