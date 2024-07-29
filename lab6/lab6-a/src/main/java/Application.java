import java.util.Iterator;
import java.util.function.Predicate;

public class Application {

    public static void main(String[] args) {
        CustomerCollection customerCollection = new CustomerCollection();
        customerCollection.addCustomer(new Customer("Alice", 30, "Chicago", "60601"));
        customerCollection.addCustomer(new Customer("Bob", 25, "New York", "10001"));
        customerCollection.addCustomer(new Customer("Charlie", 35, "Chicago", "60602"));
        customerCollection.addCustomer(new Customer("David", 40, "Los Angeles", "90001"));
        customerCollection.addCustomer(new Customer("Eve", 28, "Boston", "12345"));
        customerCollection.addCustomer(new Customer("Frank", 33, "Chicago", "12001"));

        Iterator<Customer> ageIterator = customerCollection.ageIterator();

        while (ageIterator.hasNext()) {
            System.out.println(ageIterator.next());
        }

        Predicate<Customer> chicagoFilter = customer -> customer.getAddress().contains("Chicago");
        FilterIterator chicagoIterator = new FilterIterator(customerCollection.getCustomers().iterator(),
                chicagoFilter);

        System.out.println("Customers from Chicago:");
        while (chicagoIterator.hasNext()) {
            System.out.println(chicagoIterator.next());
        }

        Predicate<Customer> zipCodeFilter = customer -> customer.getZipCode().startsWith("12");
        FilterIterator zipCodeIterator = new FilterIterator(customerCollection.getCustomers().iterator(),
                zipCodeFilter);

        System.out.println("Customers whose zip code starts with '12':");
        while (zipCodeIterator.hasNext()) {
            System.out.println(zipCodeIterator.next());
        }

        Iterator<Customer> skippingIterator = customerCollection.skippingIterator();

        System.out.println("Customers with skipping iterator:");
        while (skippingIterator.hasNext()) {
            System.out.println(skippingIterator.next());
        }
    }

}
