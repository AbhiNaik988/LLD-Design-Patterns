package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_2_without_Flow_API;

import Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_1_With_Flow_API.WeatherDataModel;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservable implements CObservable{
    private List<CObserver> observableList = new ArrayList<>();
    public WeatherDataModel weatherDataModel;

    public void setDataToObserver(WeatherDataModel weatherDataModel){
        this.weatherDataModel = weatherDataModel;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for(CObserver observer : observableList){
            observer.update();
        }
    }

    @Override
    public void addObserver(CObserver observer) {
        this.observableList.add(observer);
    }

    @Override
    public void removeObserver(CObserver observer) {
        this.observableList.remove(observer);
    }
}
