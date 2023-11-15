package Design_Patterns.Behavioural_Patterns.Chain_Of_Responsibility_Pattern;

public class PrimaryEmailHandler extends EmailHandler{
    @Override
    public boolean canHandle(String type) {
        if(type == "PRIMARY"){
            return true;
        }
        return false;
    }

    @Override
    public void doHandle() {
        System.out.println("Moving Email to Primary Folder..");
    }
}
