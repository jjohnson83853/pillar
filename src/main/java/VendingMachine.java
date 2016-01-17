/**
 * Created by bullprog3 on 1/17/16.
 */
public class VendingMachine {

    private String product;

    public void pressButton(String product) {
        this.product = product;
    }

    public String getDisplay() {
        return "You have selected cola.";
    }
}
