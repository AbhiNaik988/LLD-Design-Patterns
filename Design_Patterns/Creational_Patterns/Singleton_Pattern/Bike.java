package Design_Patterns.Creational_Patterns.Singleton_Pattern;

public class Bike {
    private static Bike bike = null;
    private Bike(){
        System.out.println("bike created!");
    }
    public static Bike getInstance(){
        if(bike == null){
            bike = new Bike();
        }
        return bike;
    }
}
