import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * @author Samet BUDAK
 * @since
 */
@RunWith(Parameterized.class)
public class SimpleCalculatorWithParameterTest {

    SimpleCalculatorWithParameter simpleCalculatorWithParameter = new SimpleCalculatorWithParameter();

    private int width;
    private int height;
    private int totalSquareMeter;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10,2,20},
                {20,2,40},
                {5,2,10},
                {24,2,48}
        });
    }

    public SimpleCalculatorWithParameterTest(int width, int height, int totalSquareMeter) {
        this.width = width;
        this.height = height;
        this.totalSquareMeter = totalSquareMeter;
    }


    @Test
    public void calculateSquareMeterTest() {
        assertEquals(20, simpleCalculatorWithParameter.calculateSquareMeter(10,2));
        assertEquals(40, simpleCalculatorWithParameter.calculateSquareMeter(20,2));
        assertEquals(10, simpleCalculatorWithParameter.calculateSquareMeter(5,2));
        assertEquals(18, simpleCalculatorWithParameter.calculateSquareMeter(24,2));

    }

    @Test
    public void calculateSquareMeterWithParametersTest() {
        int calculateSquareMeter = simpleCalculatorWithParameter.calculateSquareMeter(width, height);
        assertEquals(totalSquareMeter , calculateSquareMeter);
        System.out.println(calculateSquareMeter);

    }
}