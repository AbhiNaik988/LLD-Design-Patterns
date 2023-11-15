package Design_Patterns.Behavioural_Patterns.Mediator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{
    private List<CUser> users = new ArrayList<>();

    public void addUser(CUser user){
        this.users.add(user);
    }

    public void removeUser(CUser user){
        this.users.remove(user);
    }
    @Override
    public void receiveMessage(String message, CUser user) {
        for(CUser cUser : this.users){
            if(!cUser.equals(user)){
                cUser.receiveMessage(message,user);
            }
        }
    }
}
