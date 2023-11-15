package Design_Patterns.Behavioural_Patterns.Command_Pattern;

public class ACRemote {
    private ICommand command;
    public void setCommand(ICommand command){
        this.command = command;
    }

   public void pressButton(){
        this.command.execute();
   }
}
