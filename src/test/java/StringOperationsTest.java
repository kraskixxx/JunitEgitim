import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Samet BUDAK
 * @since
 */
public class StringOperationsTest {

    /**
     * Birleştirme işleminin doğruluğunu test ediyoruz
     */
    @Test
    public void concatanate() {
        String one = "Unit Test";
        String two = " with JUnit";
        StringOperations stringOperations = new StringOperations();
        String concatanateResult = stringOperations.concatanate(one, two);

        assertEquals("Unit Test with JUnit", concatanateResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForExceptions1() {
        StringOperations stringOperations = new StringOperations();

        stringOperations.throwIllegalArgumentException();
    }
}