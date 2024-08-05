public class TotalAmountVisitor implements Visitor {
    private int totalAmount;

    @Override
    public void visit(CorporateOrder order) {
        addAmount(order);
    }

    @Override
    public void visit(IndividualOrder order) {
        addAmount(order);
    }

    @Override
    public void visit(InternalOrder order) {
       addAmount(order);
    }

    private void addAmount(Order order) {
        int amount = order.getAmount();
        totalAmount += amount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
