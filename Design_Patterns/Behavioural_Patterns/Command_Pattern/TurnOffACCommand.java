package Design_Patterns.Behavioural_Patterns.Command_Pattern;

public class TurnOffACCommand implements ICommand{
    private AirConditioner airConditioner;
    public TurnOffACCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.turnOffAc();
    }
}
