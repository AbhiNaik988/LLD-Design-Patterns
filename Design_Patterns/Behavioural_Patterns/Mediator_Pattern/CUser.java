package Design_Patterns.Behavioural_Patterns.Mediator_Pattern;

import java.util.Objects;

public class CUser {
    private String name;
    private Mediator mediator;

    public CUser(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message){
        this.mediator.receiveMessage(message,this);
    }

    public void receiveMessage(String message,CUser user){
        System.out.println(user.name+" -> "+this.name+" : "+message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CUser cUser = (CUser) o;
        return Objects.equals(name, cUser.name) && Objects.equals(mediator, cUser.mediator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mediator);
    }
}
