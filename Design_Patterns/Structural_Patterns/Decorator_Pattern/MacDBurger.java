package Design_Patterns.Structural_Patterns.Decorator_Pattern;

public class MacDBurger extends  Burger{
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDesc() {
        return "This is MacDBurger";
    }
}
