package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_1_With_Flow_API;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class WeatherData implements Flow.Publisher<WeatherDataModel> {
    private List<Flow.Subscriber<? super WeatherDataModel>> subscriberList = new ArrayList<>();
    private WeatherDataModel weatherDataModel;

    public WeatherData(WeatherDataModel weatherDataModel){
        this.weatherDataModel = weatherDataModel;
    }

    @Override
    public void subscribe(Flow.Subscriber<? super WeatherDataModel> subscriber) {
        if(!this.alreadyHasTheSubscriber(subscriber)){
            this.subscriberList.add(subscriber);
        }
    }

    private boolean alreadyHasTheSubscriber(Flow.Subscriber<? super WeatherDataModel> subscriber){
        return subscriberList.contains(subscriber);
    }

    public void setMeasurement(WeatherDataModel weatherDataModel){
        for(Flow.Subscriber<? super WeatherDataModel> subscriber : this.subscriberList){
            subscriber.onNext(weatherDataModel);
        }
    }
}
