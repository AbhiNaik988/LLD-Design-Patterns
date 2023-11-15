package Design_Patterns.Behavioural_Patterns.Chain_Of_Responsibility_Pattern;

public abstract class EmailHandler {
    private EmailHandler nextHandler;

    public EmailHandler setNextHandler(EmailHandler handler){
        this.nextHandler = handler;
        return this;
    }

    public void handle(String type){
        if(canHandle(type)){
            doHandle();
        }
        else if(this.nextHandler != null){
            this.nextHandler.handle(type);
        }
        else{
            System.out.println("No Handler set for "+type);
        }
    }

    public abstract  boolean canHandle(String type);
    public abstract  void doHandle();
}
