package Design_Patterns.Structural_Patterns.Decorator_Pattern;

public class WithExtraCheez extends BurgerDecorator{
    private Burger burger;

    public WithExtraCheez(Burger burger){
        this.burger = burger;
    }

    @Override
    public int getPrice() {
        return this.burger.getPrice() + 20;
    }

    @Override
    public String getDesc() {
        return this.burger.getDesc() + " With Extra Cheez";
    }
}
