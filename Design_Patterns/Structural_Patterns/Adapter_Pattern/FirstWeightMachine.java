package Design_Patterns.Structural_Patterns.Adapter_Pattern;

public class FirstWeightMachine implements WeightMachine{
    private double weight;
    public FirstWeightMachine(double weight){
        this.weight = weight;
    }
    @Override
    public double getWeightInPound() {
        return weight;
    }
}
