package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_1;

public class MainClass {
    public static void main(String[] args) {
//        VehicleStore store = new VehicleStore(new SportsVehicleFactory());
//        store.getVehicle();

        VehicleStore store = new VehicleStore(new SimpleVehicleFactory());
        store.getVehicle();
    }
}
