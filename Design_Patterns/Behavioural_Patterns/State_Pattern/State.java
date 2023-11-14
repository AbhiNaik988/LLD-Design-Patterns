package Design_Patterns.Behavioural_Patterns.State_Pattern;

public interface State {
    void insertToken(int token);
    void pressOpen(int token);
    void pressClose();
}
