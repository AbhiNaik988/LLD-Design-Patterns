package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_2;

public class FurnitureStore {
    private FurnitureFactory furnitureFactory;
    FurnitureStore(FurnitureFactory furnitureFactory){
        this.furnitureFactory = furnitureFactory;
    }

    public void createFurniture(){
        Sofa sofa = furnitureFactory.getSofa();
        Table table = furnitureFactory.getTable();

        System.out.println("All Furniture Created!");
    }
}
