package mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Samet BUDAK
 * @since
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationSecondVersionTest {   

    @Mock
    private DummyCustomerService customerService;

//    @Spy
//    DummyCustomerServiceImpl dummyCustomerService;

    @Test
    public void testAnnotation() throws Exception {
        customerService.addCustomer("first");
    }

}
