package behavioralPatterns.templatePattern;

public abstract class TemplatePurchase {

    public final void purchaseOrder() {
        getItemsFromCart();
        calculatePriceWithDiscount();
        createReceipt();
        payOrder();
        notifyClient();
    }

    protected abstract void getItemsFromCart();

    protected abstract void calculatePriceWithDiscount();

    protected abstract void createReceipt();

    protected abstract void payOrder();

    protected abstract void notifyClient();

}
