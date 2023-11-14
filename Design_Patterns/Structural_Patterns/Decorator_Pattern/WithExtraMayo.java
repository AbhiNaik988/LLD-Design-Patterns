package Design_Patterns.Structural_Patterns.Decorator_Pattern;

public class WithExtraMayo extends BurgerDecorator{
    private Burger burger;

    public WithExtraMayo(Burger burger){
        this.burger = burger;
    }

    @Override
    public int getPrice() {
        return this.burger.getPrice() + 30;
    }

    @Override
    public String getDesc() {
        return this.burger.getDesc() + " With extra mayo";
    }
}
