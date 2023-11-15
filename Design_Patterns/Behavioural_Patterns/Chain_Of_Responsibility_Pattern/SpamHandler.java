package Design_Patterns.Behavioural_Patterns.Chain_Of_Responsibility_Pattern;

public class SpamHandler extends EmailHandler{
    @Override
    public boolean canHandle(String type) {
        if(type == "SPAM"){
            return true;
        }
        return false;
    }

    @Override
    public void doHandle() {
        System.out.println("Moving Email to Spam Folder..");
    }
}
