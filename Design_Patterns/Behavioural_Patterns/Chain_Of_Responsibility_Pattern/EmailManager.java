package Design_Patterns.Behavioural_Patterns.Chain_Of_Responsibility_Pattern;

public class EmailManager {
    private EmailHandler currentEmailHandler;
    public EmailManager(){
        SpamHandler spamHandler = new SpamHandler();
        PromotionEmailHandler promotionEmailHandler = new PromotionEmailHandler();
        PrimaryEmailHandler primaryEmailHandler = new PrimaryEmailHandler();
        primaryEmailHandler.setNextHandler(promotionEmailHandler);
        promotionEmailHandler.setNextHandler(spamHandler);

        this.currentEmailHandler = primaryEmailHandler;
    }

    public void handleEmail(String type){
        this.currentEmailHandler.handle(type);
    }

}
