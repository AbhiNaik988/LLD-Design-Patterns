package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_2_without_Flow_API;

public class WeatherObserver implements CObserver{
    private WeatherDataObservable observable;
    public WeatherObserver(WeatherDataObservable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Weather Data Updated: "+observable.weatherDataModel.toString());
    }
}
