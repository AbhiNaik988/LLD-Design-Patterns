package Design_Patterns.Behavioural_Patterns.Interpreter_Pattern;

public class NumberExpression implements Expression{
    private final int numberValue;
    public NumberExpression(int numberValue){
        this.numberValue = numberValue;
    }
    @Override
        public int interpret(CContext context) {
        return numberValue;
    }
}
