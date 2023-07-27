package exceptions;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc calc = new BadCalc();
        System.out.println("Mult result: " + calc.mult(2, 3));
        try {
            System.out.println("Div result: " + calc.div(6, 0));
        } catch (ArithmeticException e) {
            System.out.println("calculation error caught: " + e.getMessage());
        }
    }
}
