public class TVOrderVisitor implements Visitor {
    private int tvcounter;
    @Override
    public void visit(CorporateOrder order) {
        add(order);
    }

    @Override
    public void visit(IndividualOrder order) {
        add(order);
    }

    @Override
    public void visit(InternalOrder order) {
        add(order);
    }

    private void add(Order order) {
        if (order.getState().equals("ordered")) {
            int tvs =
                    order.getOrderlineList().stream()
                            .filter(orderline -> orderline.getProduct().getName().equals("TV"))
                            .map(o -> o.getQuantity()).findAny().orElse(0);
            tvcounter += tvs;
        }
    }

    public long getTvcounter() {
        return tvcounter;
    }
}
