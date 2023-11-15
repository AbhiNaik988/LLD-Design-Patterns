package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_1_With_Flow_API;

import java.util.concurrent.Flow;

public class WeatherSubscriber implements Flow.Subscriber<WeatherDataModel>{
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(WeatherDataModel item) {
        System.out.println("Weather data changed: "+item.toString());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Throwable : "+throwable.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("Subscription Completed!");
    }
}
