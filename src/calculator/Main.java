package calculator;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.calculate(2, 1, '+'));
        System.out.println(calc.calculate(2, 1, '-'));
        System.out.println(calc.calculate(2, 2, '*'));
        System.out.println(calc.calculate(1, 0, '/'));
        System.out.println(calc.calculate(2, 2, 'r'));
        System.out.println(calc.calculate(8, 2, '^'));
        System.out.println(calc.calculate(2, 2, 'x'));
    }
}
