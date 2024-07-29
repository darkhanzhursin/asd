import java.util.*;

public class AgeIterator implements Iterator<Customer> {

    private List<Customer> sortedCustomers;
    private int currentIndex = 0;

    public AgeIterator(List<Customer> customers) {
        this.sortedCustomers = new ArrayList<>(customers);
        Collections.sort(this.sortedCustomers, Comparator.comparingInt(Customer::getAge));
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sortedCustomers.size();
    }

    @Override
    public Customer next() {
        return sortedCustomers.get(currentIndex++);
    }
}
