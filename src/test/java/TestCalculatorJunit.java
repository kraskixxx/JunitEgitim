import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Samet BUDAK
 * @since
 */
public class TestCalculatorJunit extends TestCase {

    public void testAdd() {
        Calculator calculator = new Calculator();

        double result = calculator.add(10,50);

        //Expected result should be always on left side
        assertEquals(60, result, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testThatSummationRaisesAnExceptionOnNegativeInputNumbers() {

        Calculator calculator = new Calculator();
        double add = calculator.add(-1, -3);
        assertEquals(-4.0, add);

    }
}
