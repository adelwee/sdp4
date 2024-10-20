public class PaidOrderState implements State {
    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is being shipped.");
        order.setState(order.getShippedState()); // Переход в состояние Shipped
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver the order. It hasn't been shipped yet.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        order.setState(order.getCancelledState());
    }
}
