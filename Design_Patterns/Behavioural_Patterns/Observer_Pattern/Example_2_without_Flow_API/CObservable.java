package Design_Patterns.Behavioural_Patterns.Observer_Pattern.Example_2_without_Flow_API;

public interface CObservable {
    void notifySubscribers();
    void addObserver(CObserver observer);
    void removeObserver(CObserver observer);
}
