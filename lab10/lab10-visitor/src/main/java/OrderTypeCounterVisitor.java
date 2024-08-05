public class OrderTypeCounterVisitor implements Visitor {

    @Override
    public void visit(CorporateOrder order) {
        count(order);
    }

    @Override
    public void visit(IndividualOrder order) {
        count(order);
    }

    @Override
    public void visit(InternalOrder order) {
        count(order);
    }

    private void count(Order order) {
        int counter = order.getCounter();
        counter++;
        order.setCounter(counter);
    }
}
