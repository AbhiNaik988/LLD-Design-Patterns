package Design_Patterns.Creational_Patterns.Abstract_Factory_Pattern.example_2;

public class MainClass{
    public static void main(String[] args) {
        FurnitureStore store = new FurnitureStore(new LuxuryFurnitureFactory());
        store.createFurniture();
    }
}
