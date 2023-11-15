package Design_Patterns.Behavioural_Patterns.Interpreter_Pattern;

public class MultiplyExpression implements Expression{
    private final Expression leftExpression;
    private final Expression rightExpression;

    public MultiplyExpression(Expression leftExpression,Expression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(CContext context) {
        return this.leftExpression.interpret(context) * this.rightExpression.interpret(context);
    }
}
