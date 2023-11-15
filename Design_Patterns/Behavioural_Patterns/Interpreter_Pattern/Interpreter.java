package Design_Patterns.Behavioural_Patterns.Interpreter_Pattern;

public class Interpreter {
    private final Expression expression;
    private final CContext context;

    public Interpreter(Expression expression,CContext context){
        this.expression = expression;
        this.context = context;
    }

    public int interpret(){
        return this.expression.interpret(this.context);
    }
}
