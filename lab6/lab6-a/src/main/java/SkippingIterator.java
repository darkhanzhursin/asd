import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SkippingIterator implements Iterator<Customer> {

    private List<Customer> customers;
    private int currentIndex = 0;

    public SkippingIterator(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < customers.size();
    }

    @Override
    public Customer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Customer customer = customers.get(currentIndex);
        currentIndex += 2;
        return customer;
    }
}
