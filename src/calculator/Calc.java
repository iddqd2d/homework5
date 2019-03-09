package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class Calc {
    private Map<Character, DoubleBinaryOperator> operation;

    Calc() {
        operation = new HashMap<>();
        operation.put('+', Double::sum);
        operation.put('-', (a, b) -> a - b);
        operation.put('*', (a, b) -> a * b);
        operation.put('/', (a, b) -> a / b);
        operation.put('^', Math::pow);
        operation.put('r', (a, b) -> Math.exp(Math.log(a) / b));
        operation.put('x', (a, b) -> Math.pow(((a + b) / (a + 117)), b));
    }

    public double calculate(double num1, double num2, char operator) {
        return operation.get(operator).applyAsDouble(num1, num2);
    }

}
