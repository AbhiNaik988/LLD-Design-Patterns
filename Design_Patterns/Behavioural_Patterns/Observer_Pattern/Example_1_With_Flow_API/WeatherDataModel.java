package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_1_With_Flow_API;

public class WeatherDataModel {
    private double temperature;
    private double humidity;

    public WeatherDataModel(double temperature,double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherDataModel{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
