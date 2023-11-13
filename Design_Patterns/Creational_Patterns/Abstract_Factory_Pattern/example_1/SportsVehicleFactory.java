package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_1;

public class SportsVehicleFactory implements VehicleFactory{

    @Override
    public Car getCar() {
        return new SportsCar();
    }

    @Override
    public Bike getBike() {
        return new SportsBike();
    }
}
