package Design_Patterns.Behavioural_Patterns.Command_Pattern;

public class AirConditioner {
    private boolean isOn;

    public void turnOnAc(){
        System.out.println("Turning on AC..");
        this.isOn = true;
    }

    public void turnOffAc(){
        System.out.println("Turning off AC..");
        this.isOn = false;
    }

    public void getAcCondition(){
        System.out.println("AC is currently "+(this.isOn ? "On." : "Off."));
    }
}
