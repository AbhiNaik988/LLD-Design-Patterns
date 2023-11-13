package Design_Patterns.Structural_Patterns.Adapter_Pattern;

public class FirstWeightMachineAdapter implements WeightInKgAdapter{
    private FirstWeightMachine firstWeightMachine;

    public FirstWeightMachineAdapter(FirstWeightMachine firstWeightMachine){
        this.firstWeightMachine = firstWeightMachine;
    }

    @Override
    public double getWeightInKG() {
        return firstWeightMachine.getWeightInPound() * 0.453592;
    }
}
