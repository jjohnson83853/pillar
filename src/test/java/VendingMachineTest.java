import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bullprog3 on 1/17/16.
 */
public class VendingMachineTest {

    @Test
    public void selectCola() {
        final VendingMachine myVendingMachine = new VendingMachine();
        myVendingMachine.pressButton("cola");
        assertEquals("You have selected cola.", myVendingMachine.getDisplay());
    }
}
