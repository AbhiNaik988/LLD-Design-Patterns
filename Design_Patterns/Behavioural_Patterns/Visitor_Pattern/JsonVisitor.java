package Design_Patterns.Behavioural_Patterns.Visitor_Pattern;

public class JsonVisitor implements Visitor{
    @Override
    public void accept(Product product) {
        String json = "{ "+"\"productName\" : \""+product.getProductName()+"\", \"productPrice\" : \""+product.getProductPrice()+"\" }";
        System.out.println(json);
    }
}
