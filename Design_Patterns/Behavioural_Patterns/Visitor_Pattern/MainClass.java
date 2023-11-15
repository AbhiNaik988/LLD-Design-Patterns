package Design_Patterns.Behavioural_Patterns.Visitor_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Mobile poco = new Mobile("Poco x5 pro",25000);
        Mobile realme = new Mobile("Realme 1",13000);
        Telephone tele = new Telephone("Telephone",20000);
        Product soap = new Product("Soap",50);
        Product shampoo = new Product("Shampoo",60);

        Visitor jsonVisitor = new JsonVisitor();
        poco.visit(jsonVisitor);
        realme.visit(jsonVisitor);
        tele.visit(jsonVisitor);
        soap.visit(jsonVisitor);
        shampoo.visit(jsonVisitor);

        //Like this, we can create as may visitor as we want
        //That is how we add operations horizontally to the class.
    }
}
