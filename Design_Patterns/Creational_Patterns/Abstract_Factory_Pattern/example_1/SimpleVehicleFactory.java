package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_1;

public class SimpleVehicleFactory implements VehicleFactory{
    @Override
    public Car getCar() {
        return new Car("Simple");
    }

    @Override
    public Bike getBike() {
        return new Bike("Simple");
    }
}
