package mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Samet BUDAK
 * @since
 */
public class AnnotationTest {

    private DummyCustomerService customerService;

    @Before
    public void setUp() throws Exception {
        customerService = Mockito.mock(DummyCustomerService.class);
    }

    @Test
    public void testAnnotation() throws Exception {
        customerService.addCustomer("first");
    }

}
