package Design_Patterns.Behavioural_Patterns.Command_Pattern;

public class TurnONACCommand implements ICommand{
    private AirConditioner airConditioner;
    public TurnONACCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        this.airConditioner.turnOnAc();
    }
}
