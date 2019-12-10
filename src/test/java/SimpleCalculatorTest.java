import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author Samet BUDAK
 * @since
 */
public class SimpleCalculatorTest {

    @Before
    public void setUp() {
        System.out.println("---- Before method ----");
    }

    @After
    public void tearDown() {
        System.out.println("---- After method ---- ");
    }

    @Test
    public void addNumberTest(){
        int numberOne = 8;
        int numberTwo = 17;
        int result = SimpleCalculator.add(numberOne, numberTwo);
        assertEquals(25, result);
        System.out.println("addNumberTest Method");
    }

    /**
     * Different result than expected
     * Example Failure
     */
    @Test
    public void divideNumbersAndExpectWrongResult() {
        double result = SimpleCalculator.divideNumbers(6, 3);
        assertEquals(2, (int)result);
        System.out.println("divideNumbersAndExpectWrongResult method");
    }

    /**
     * Example Error
     * Given-When-Then
     */
    //@Test
    @Ignore
    public void whenDivideByZero_thenThrowsException(){
        SimpleCalculator.divideNumbers(10, 0);
    }

    /**
     * When we fix the test by including the exception
     */
    //@Test(expected = java.lang.ArithmeticException.class)
    public void divideByZeroAndAssertException(){
        double result = SimpleCalculator.divideNumbers(6, 0);
    }
}
