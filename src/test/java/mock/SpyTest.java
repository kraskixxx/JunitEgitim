package mock;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.spy;

/**
 * @author Samet BUDAK
 * @since
 */
public class SpyTest {

    @Test
    public void testSpy() throws Exception {
        DummyCustomerService customerService = spy(new DummyCustomerServiceImpl());

        doNothing().when(customerService).addCustomer(eq("First Customer"));

        //Spy Object calls real object
        //doCallRealMethod().when(customerService).removeCustomer("First");

        customerService.removeCustomer("First");

        customerService.addCustomer("First Customer");
    }
}
