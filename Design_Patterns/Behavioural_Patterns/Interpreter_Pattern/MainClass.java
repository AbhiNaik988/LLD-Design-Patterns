package Design_Patterns.Behavioural_Patterns.Interpreter_Pattern;

public class MainClass {
    public static void main(String[] args) {
        Expression multiplyExpression1 = new MultiplyExpression(
          new NumberExpression(5),
          new VariableExpression("x")
        );

        Expression multiplyExpression2 = new MultiplyExpression(
                new NumberExpression(3),
                new VariableExpression("y")
        );

        Expression variableExpression = new VariableExpression("z");

        Expression finalExpression = new AddExpression(
                new AddExpression(multiplyExpression1,multiplyExpression2),
                variableExpression
        );


        CContext context = new CContext();
        context.setValue("x",2);
        context.setValue("y",3);
        context.setValue("z",4);
        Interpreter interpreter = new Interpreter(finalExpression,context);

        int result = interpreter.interpret();
        System.out.println("Result is : "+result); //5x + 3y + z => 23
    }
}
