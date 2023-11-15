package Design_Patterns.Behavioural_Patterns.Visitor_Pattern;

public class Product {
    private String productName;
    private int productPrice;

    public Product(String name,int price){
        this.productName = name;
        this.productPrice = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void visit(Visitor visitor){
        visitor.accept(this);
    }
}
