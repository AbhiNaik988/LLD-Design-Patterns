package Design_Patterns.Creational_Patterns.Builder_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car.builder()
                .setModel("Swift")
                .setPrice(5000000)
                .setFuelType("CNG")
                .build();

        System.out.println("car object : "+car.toString());

        //This is an immutable object because we have set setters of Car private.
        //If you want mutable object then you have to make setters of Car public.
    }
}
