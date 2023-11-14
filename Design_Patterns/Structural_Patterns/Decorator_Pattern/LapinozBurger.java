package Design_Patterns.Structural_Patterns.Decorator_Pattern;

public class LapinozBurger extends  Burger{
    @Override
    public int getPrice() {
        return 80;
    }

    @Override
    public String getDesc() {
        return "This is Lapinoz Burger";
    }
}
