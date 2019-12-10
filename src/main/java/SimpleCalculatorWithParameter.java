/**
 * @author Samet BUDAK
 * @since
 */
public class SimpleCalculatorWithParameter {

    public static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static double divideNumbers(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero!");
        }

        return dividend / divisor;
    }

    public int calculateSquareMeter(int width, int height){
        return width * height;
    }
}
