package mock;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * @author Samet BUDAK
 * @since
 */
public class PreStageTest {

    @Test
    public void testWhen() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        when(customerService.getCustomer(anyString())).thenReturn("firstCustomer");

        //when(customerService.getCustomer(eq("second"))).thenReturn("firstCustomer");

        String customer = customerService.getCustomer("Second Customer");

        assertThat(customer).isEqualTo("firstCustomer");
    }

    @Test
    public void testWhenThenThrowException() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        //if you give customer you can get exception
        when(customerService.getCustomer(eq("customer"))).thenThrow(new RuntimeException());

        String customer = customerService.getCustomer("customer");

        //assertThat(customer).isEqualTo("firstCustomer");
    }
}
