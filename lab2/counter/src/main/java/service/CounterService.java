package service;

import counter.Counter;
import observer.Subject;
import repo.CounterDAO;
import repo.ICounterDAO;
import state.SingleDigit;

public class CounterService extends Subject implements ICounterService {

    private ICounterDAO counterDAO;
    private Counter counter;

    public CounterService() {
        this.counterDAO = new CounterDAO();
        this.counter = new Counter();
        counter.setCounterState(new SingleDigit(counter));
        counterDAO.save(counter);
    }

    @Override
    public void increment() {
        counter.increment();
        donotify(counter.getCount());
        counterDAO.update(counter);
    }

    @Override
    public void decrement() {
        counter.decrement();
        donotify(counter.getCount());
        counterDAO.update(counter);
    }
}
