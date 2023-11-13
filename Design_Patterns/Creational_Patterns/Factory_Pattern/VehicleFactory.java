package Design_Patterns.Creational_Patterns.Factory_Pattern;

public class VehicleFactory {
    Vehicle getVehicle(String vehicleType){
        switch (vehicleType){
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
        }
        return null;
        //See null object pattern. we should follow that pattern and return Type instead returning null here.
    }
    //instead of creating getVehicle() method we could also have Vehicle instance object,
    //and we could pass a Vehicle type object into constructor
    //and define logic inside constructor instead getVehicle() method.
}
