import java.util.Date;

public class Application {

    public static void main(String[] args) {
        OrderCollection orderCollection = new OrderCollection();
        Orderline orderline1 = new Orderline(new Product("TV", 100), 2);
        Orderline orderline2 = new Orderline(new Product("Book", 15), 10);
        Orderline orderline3 = new Orderline(new Product("Bike", 150), 1);
        Order order1 = new InternalOrder(new Date(), 100, "ordered", "IT");
        order1.addOrderline(orderline1);
        order1.addOrderline(orderline2);
        Order order2 = new IndividualOrder(new Date(), 1, "done", "John");
        order2.addOrderline(orderline2);
        order2.addOrderline(orderline3);
        Order order3 = new CorporateOrder(new Date(), 2, "ordered", "Apple", "1234123");
        order3.addOrderline(orderline3);
        order3.addOrderline(orderline1);
        orderCollection.addOrder(order1);
        orderCollection.addOrder(order2);
        orderCollection.addOrder(order3);
        orderCollection.print();
    }
}
