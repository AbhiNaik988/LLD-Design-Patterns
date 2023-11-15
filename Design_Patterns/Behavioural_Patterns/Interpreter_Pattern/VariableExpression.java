package Design_Patterns.Behavioural_Patterns.Interpreter_Pattern;

public class VariableExpression implements Expression{
    private final String varibleValue;

    public VariableExpression(String varibleValue){
        this.varibleValue = varibleValue;
    }

    @Override
    public int interpret(CContext context) {
        return context.getValue(this.varibleValue);
    }
}
