package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_2_without_Flow_API;

import Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_1_With_Flow_API.WeatherDataModel;

public class MainClass {
    public static void main(String[] args) {
        WeatherDataObservable observable = new WeatherDataObservable();
        WeatherObserver observer = new WeatherObserver(observable);
        observable.setDataToObserver(new WeatherDataModel(55,22));
        sleepFor1Sec();
        observable.setDataToObserver(new WeatherDataModel(23,55));
        sleepFor1Sec();
        observable.setDataToObserver(new WeatherDataModel(52,18));
        sleepFor1Sec();
        observable.setDataToObserver(new WeatherDataModel(56,20));
        sleepFor1Sec();
        observable.setDataToObserver(new WeatherDataModel(34,24));
        sleepFor1Sec();
    }

    private static void sleepFor1Sec(){
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
