package Design_Patterns.Structural_Patterns.Decorator_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Burger lapinozBurger = new LapinozBurger();
        Burger extraMayo = new WithExtraMayo(lapinozBurger);
        Burger extraCheezMayo = new WithExtraCheez(extraMayo);
        System.out.println(extraCheezMayo.getPrice());
        System.out.println(extraCheezMayo.getDesc());
    }
}
