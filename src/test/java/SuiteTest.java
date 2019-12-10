import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Samet BUDAK
 * @since
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MyMathTest.class,
        SimpleCalculatorTest.class,
        SimpleCalculatorWithParameterTest.class,
        TestCalculator.class
})
public class SuiteTest {
}
