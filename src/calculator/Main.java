package calculator;

import static calculator.Calc.calculate;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(2, 1, '+'));
        System.out.println(calculate(2, 1, '-'));
        System.out.println(calculate(2, 2, '*'));
        System.out.println(calculate(1, 0, '/'));
        System.out.println(calculate(2, 2, 'r'));
        System.out.println(calculate(8, 2, '^'));
        System.out.println(calculate(2, 2, 'x'));
        System.out.println(calculate(2, 2, ' '));
    }
}
