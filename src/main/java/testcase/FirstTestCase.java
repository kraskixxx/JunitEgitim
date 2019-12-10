package testcase;

import junit.framework.TestCase;

/**
 * @author Samet BUDAK
 * @since
 */
public class FirstTestCase extends TestCase {

    public FirstTestCase(String argOne) {
        super(argOne);
    }

    public static void main(String[] args) {

    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCompareSucceed(){
        assertEquals(0,0);
    }

    public void compareSucceed(){
        assertEquals(0,0);
    }
}
