package Design_Patterns.Behavioural_Patterns.Mediator_Pattern;

public class MainClass {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        CUser abhi =  new CUser("abhi",chatMediator);
        CUser abhay = new CUser("abhay",chatMediator);
        CUser dhruv = new CUser("dhruv",chatMediator);
        CUser dev = new CUser("dev",chatMediator);

        chatMediator.addUser(abhi);
        chatMediator.addUser(abhay);
        chatMediator.addUser(dhruv);
        chatMediator.addUser(dev);

        abhi.sendMessage("Hello everyone!");
        dhruv.sendMessage("Hello abhi!");
    }
}
