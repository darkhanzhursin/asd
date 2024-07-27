package state;

import counter.Counter;

public class SingleDigit implements CounterState {

    private Counter counter;
    private int count;

    public SingleDigit(Counter counter) {
        this.counter = counter;
        count = counter.getCount();
    }

    @Override
    public void increment() {
        count++;
        counter.setCount(count);
        if (count > 9) {
            counter.setCounterState(new DoubleDigit(counter, count));
        }
    }

    @Override
    public void decrement() {
        count--;
        counter.setCount(count);
        if (count < -9) {
            counter.setCounterState(new DoubleDigit(counter, count));
        }
    }
}
