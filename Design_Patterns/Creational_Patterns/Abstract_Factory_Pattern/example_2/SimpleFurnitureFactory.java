package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_2;

public class SimpleFurnitureFactory implements FurnitureFactory{
    @Override
    public Sofa getSofa() {
        return new Sofa("Simple");
    }

    @Override
    public Table getTable() {
        return new Table("Simple");
    }
}
