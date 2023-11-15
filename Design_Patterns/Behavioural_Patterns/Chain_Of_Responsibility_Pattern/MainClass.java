package Design_Patterns.Behavioural_Patterns.Chain_Of_Responsibility_Pattern;

public class MainClass {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager();
//        manager.handleEmail("PRIMARY");
//        manager.handleEmail("SPAM");
        manager.handleEmail("PROMO");
    }
}
