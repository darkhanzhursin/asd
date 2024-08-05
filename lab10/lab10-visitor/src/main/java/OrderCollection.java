import java.util.ArrayList;
import java.util.Collection;

public class OrderCollection {

    private Collection<Order> orderCollection;

    public OrderCollection() {
        orderCollection = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderCollection.add(order);
    }

    public void print() {
        OrderTypeCounterVisitor visitor1 = new OrderTypeCounterVisitor();
        TotalAmountVisitor visitor2 = new TotalAmountVisitor();
        TVOrderVisitor visitor3 = new TVOrderVisitor();
        for (Order order : orderCollection) {
            if (order instanceof CorporateOrder) {
                CorporateOrder corporateOrder = (CorporateOrder) order;
                corporateOrder.accept(visitor1);
                corporateOrder.accept(visitor2);
                corporateOrder.accept(visitor3);
                System.out.println("CorporateOrder counter: " + order.getCounter());
            }
            if (order instanceof IndividualOrder) {
                IndividualOrder individualOrder = (IndividualOrder) order;
                individualOrder.accept(visitor1);
                individualOrder.accept(visitor2);
                individualOrder.accept(visitor3);
                System.out.println("IndividualOrder counter: " + order.getCounter());
            }
            if (order instanceof InternalOrder) {
                InternalOrder internalOrder = (InternalOrder) order;
                internalOrder.accept(visitor1);
                internalOrder.accept(visitor2);
                internalOrder.accept(visitor3);
                System.out.println("InternalOrder counter: " + order.getCounter());
            }
        }
        System.out.println("Total amount of all orders: " + visitor2.getTotalAmount());
        System.out.println("Total amount of TVs are: " + visitor3.getTvcounter());
    }
}
