package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_1_With_Flow_API;

public class MainClass {
    private static void sleepFor1Sec(){
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new WeatherDataModel(1.5,3.4));
        WeatherSubscriber weatherSubscriber = new WeatherSubscriber();
        weatherData.subscribe(weatherSubscriber);

        weatherData.setMeasurement(new WeatherDataModel(4.4,2.2));
        sleepFor1Sec();
        weatherData.setMeasurement(new WeatherDataModel(9.6,1.2));
        sleepFor1Sec();
        weatherData.setMeasurement(new WeatherDataModel(14.4,6.2));
        sleepFor1Sec();
        weatherData.setMeasurement(new WeatherDataModel(43.4,29.2));
        sleepFor1Sec();

        weatherSubscriber.onComplete();
    }
}
