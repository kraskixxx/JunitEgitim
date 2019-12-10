import java.math.BigDecimal;

/**
 * @author Samet BUDAK
 * @since
 */
public class SimpleCalculator {

    public static int add(int numberOne, int numberTwo){
    return numberOne + numberTwo;
    }

    public static double divideNumbers(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero!");
        }

        return dividend / divisor;
    }
}
