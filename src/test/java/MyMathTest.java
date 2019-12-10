import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Samet BUDAK
 * @since
 */
public class MyMathTest {

    @Test
    public void isPrime() {
        assertEquals(true,MyMath.isPrime(35));

        //simplified assertion
        //assertTrue(MyMath.isPrime(35));
    }
}