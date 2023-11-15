package Design_Patterns.Behavioural_Patterns.Command_Pattern;

public class MainClass {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        ACRemote remote = new ACRemote();

        remote.setCommand(new TurnONACCommand(airConditioner));
        remote.pressButton();
    }
}
