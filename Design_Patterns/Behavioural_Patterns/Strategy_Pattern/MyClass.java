package Design_Patterns.Behavioural_Patterns.Strategy_Pattern;

public class MyClass {
    public static void main(String[] args) {
        MountainTruck mountainTruck = new MountainTruck(new NormalDriveStrategy());
        mountainTruck.drive();

        Car car = new Car(new SpecialDriveStrategy());
        car.drive();
    }
}
