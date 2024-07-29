import java.util.Iterator;
import java.util.function.Predicate;

public class FilterIterator implements Iterator<Customer> {

    private Iterator<Customer> iterator;
    private Predicate<Customer> predicate;
    private Customer nextCustomer;
    private boolean hasNextCustomer;

    public FilterIterator(Iterator<Customer> iterator, Predicate<Customer> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
        advance();
    }

    private void advance() {
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (predicate.test(customer)) {
                nextCustomer = customer;
                hasNextCustomer = true;
                return;
            }
        }
        hasNextCustomer = false;
    }

    @Override
    public boolean hasNext() {
        return hasNextCustomer;
    }

    @Override
    public Customer next() {
        Customer customer = nextCustomer;
        advance();
        return customer;
    }
}
