package mock;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * @author Samet BUDAK
 * @since
 */
public class BehaviourTest {

    @Test
    public void testBehavior () throws Exception {

        DummyCustomerService customerService = mock(DummyCustomerService.class);

        customerService.addCustomer("First Customer");
        customerService.addCustomer("Second Customer");

        //Verify Mockito

        verify(customerService).addCustomer("First Customer");
        verify(customerService).addCustomer("Second Customer");

        //For getting error rmeove comment on next line

        //verify(customerService).addCustomer("Third Customer");

        //count method calls


    }

    @Test
    public void testMethodCount () throws Exception {

        DummyCustomerService customerService = mock(DummyCustomerService.class);
        customerService.addCustomer("First");
        customerService.addCustomer("First");
        customerService.addCustomer("Second");
        customerService.addCustomer("Third");
        customerService.addCustomer("Fourth");
        customerService.addCustomer("Fifth");

        verify(customerService, times(2)).addCustomer("First");


        //check that removeCustomer never called
        verify(customerService, never()).removeCustomer(anyString());


        //check that addCustomer never called for "Sixth"
        verify(customerService, never()).addCustomer("Sixth");


        //check that Second customer invoked at least two times - For showing error
        verify(customerService, atLeast(2)).addCustomer("Second");

    }


    @Test
    public void testMethodCallOrder() throws Exception {
        DummyCustomerService customerService = mock(DummyCustomerService.class);

        customerService.addCustomer("First");
        customerService.addCustomer("Second");
        customerService.updateCustomer("Third");

        InOrder inOrder = inOrder(customerService);
        inOrder.verify(customerService).addCustomer("First");
        inOrder.verify(customerService).addCustomer("Second");
        inOrder.verify(customerService).updateCustomer("Third");
    }

    @Test
    public void testVerifyNoMoreInteractions() throws Exception {

        DummyCustomerService customerService = mock(DummyCustomerService.class);

        customerService.addCustomer("First Customer");
        customerService.removeCustomer("Second Customer");

        //for error case
        //customerService.addCustomer("Third Customer");

        //Verify Mockito

        verify(customerService).addCustomer("First Customer");
        verify(customerService).removeCustomer("Second Customer");

        verifyNoMoreInteractions(customerService);


    }

}
