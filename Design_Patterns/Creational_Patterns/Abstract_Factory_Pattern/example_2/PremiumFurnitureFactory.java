package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_2;

public class PremiumFurnitureFactory implements FurnitureFactory{
    @Override
    public Sofa getSofa() {
        return new PremiumSofa();
    }

    @Override
    public Table getTable() {
        return new PremiumTable();
    }
}
