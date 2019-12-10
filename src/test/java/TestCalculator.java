/**
 * @author Samet BUDAK
 * @since
 */
public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(10,50);

        if(result != 60) {
            System.out.println("Bad result: " + result);
        }
    }
}



class TestCalculatorNew {

    private int numberOfErrors = 0;

    public void testAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(10,50);
    }

    public static void main(String[] args) {
        TestCalculatorNew test = new TestCalculatorNew();
        try {

            test.testAdd();
        } catch (Throwable e) {
            test.numberOfErrors++;
            e.printStackTrace();
        }

        if(test.numberOfErrors > 0) {
            throw new RuntimeException("There were " + test.numberOfErrors + " error(s) in test");
        }
    }
}