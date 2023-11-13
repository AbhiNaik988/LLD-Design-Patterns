package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_2;

public class LuxuryFurnitureFactory implements FurnitureFactory{
    @Override
    public Sofa getSofa() {
        return new LuxurySofa();
    }

    @Override
    public Table getTable() {
        return new LuxuryTable();
    }
}
