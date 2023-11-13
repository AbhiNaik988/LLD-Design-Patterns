package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_1;

public class VehicleStore {
    private VehicleFactory vehicleFactory;
    public VehicleStore(VehicleFactory vehicleFactory){
        this.vehicleFactory = vehicleFactory;
    }

    public void getVehicle(){
        Bike bike = vehicleFactory.getBike();
        Car car = vehicleFactory.getCar();
    }
}
