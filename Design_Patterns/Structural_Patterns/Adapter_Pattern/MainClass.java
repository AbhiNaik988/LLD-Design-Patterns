package Design_Patterns.Structural_Patterns.Adapter_Pattern;

public class MainClass {
    public static void main(String[] args) {
        FirstWeightMachineAdapter adapter = new FirstWeightMachineAdapter(new FirstWeightMachine(30.23));
        System.out.println(adapter.getWeightInKG());
    }
}
