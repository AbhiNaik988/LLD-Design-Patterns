package Design_Patterns.Creational_Patterns.Builder_Pattern;

public class Car {
    private String model;
    private double price;
    private String fuelType;

    static class builder{
        private String model;
        private double price;
        private String fuelType;

        public String getModel() {
            return model;
        }

        public builder setModel(String model) {
            this.model = model;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public String getFuelType() {
            return fuelType;
        }

        public builder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.setModel(this.model);
            car.setPrice(this.price);
            car.setFuelType(this.fuelType);
            return car;
        }
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    private void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
