package state;

import counter.Counter;

public class TripleDigit implements CounterState {

    private Counter counter;
    private int count;

    public TripleDigit(Counter counter, int count) {
        this.counter = counter;
        this.count = count;
    }

    @Override
    public void increment() {
        count += 3;
        counter.setCount(count);
        if (count < 100 && count > -100) counter.setCounterState(new DoubleDigit(counter, count));
    }

    @Override
    public void decrement() {
        count -= 3;
        counter.setCount(count);
        if (count < 100 && count > -100) counter.setCounterState(new DoubleDigit(counter, count));
    }
}
