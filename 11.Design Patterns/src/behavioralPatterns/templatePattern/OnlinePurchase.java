package behavioralPatterns.templatePattern;

public class OnlinePurchase extends TemplatePurchase {

    @Override
    protected void getItemsFromCart() {
        System.out.println("Getting your items from your online cart");
    }

    @Override
    protected void calculatePriceWithDiscount() {
        System.out.println("no discount");
    }

    @Override
    protected void createReceipt() {
        System.out.println("Total: 199.99");
    }

    @Override
    protected void payOrder() {
        System.out.println("Paying with cart");
    }

    @Override
    protected void notifyClient() {
        System.out.println("Sending email");
    }
}
