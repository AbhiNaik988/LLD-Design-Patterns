package Design_Patterns.Creational_Patterns.Factory_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle("TRUCK");

        //Create object according to conditions at runtime
    }
}
