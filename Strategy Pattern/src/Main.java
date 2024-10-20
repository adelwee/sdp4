public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.0);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200.0);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300.0);
    }
}