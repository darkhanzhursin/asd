import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerCollection {

    private List<Customer> customers;

    public CustomerCollection() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Iterator<Customer> ageIterator() {
        return new AgeIterator(customers);
    }

    public Iterator<Customer> skippingIterator() {
        return new SkippingIterator(customers);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
