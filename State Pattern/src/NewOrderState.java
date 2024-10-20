public class NewOrderState implements State {
    private Order order;

    public NewOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has been paid.");
        order.setState(order.getPaidState()); // Переход в состояние Paid
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship the order. It hasn't been paid yet.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver the order. It hasn't been shipped yet.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        order.setState(order.getCancelledState()); // Переход в состояние Cancelled
    }
}