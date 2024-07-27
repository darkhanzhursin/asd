package state;

import counter.Counter;

public class DoubleDigit implements CounterState {

    private Counter counter;
    private int count;

    public DoubleDigit(Counter counter, int count) {
        this.counter = counter;
        this.count = count;
    }

    @Override
    public void increment() {
        count += 2;
        counter.setCount(count);
        if (count < 10 && count > -10) counter.setCounterState(new SingleDigit(counter));
        if (count > 99) counter.setCounterState(new TripleDigit(counter, count));
    }

    @Override
    public void decrement() {
        count -= 2;
        counter.setCount(count);
        if (count < 10 && count > -10) counter.setCounterState(new SingleDigit(counter));
        if (count < -99) counter.setCounterState(new TripleDigit(counter, count));
    }
}
