package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;

public class Calc {
    private static Map<Character, DoubleBinaryOperator> operation;

    static  {
        operation = new HashMap<>();
        operation.put('+', Double::sum);
        operation.put('-', (a, b) -> a - b);
        operation.put('*', (a, b) -> a * b);
        operation.put('/', (a, b) -> a / b);
        operation.put('^', Math::pow);
        operation.put('r', (a, b) -> Math.exp(Math.log(a) / b));
        operation.put('x', (a, b) -> Math.pow(((a + b) / (a + 117)), b));
        operation.put('n', (a, b) -> 0);
    }

    public static double calculate(double num1, double num2, char operator) {
        return operation.getOrDefault(operator, operation.get('n')).applyAsDouble(num1, num2);
    }

}
