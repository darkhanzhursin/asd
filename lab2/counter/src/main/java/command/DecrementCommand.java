package command;

import counter.Counter;

public class DecrementCommand implements Command {

    Counter counter;
    public DecrementCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute() {
        counter.decrement();
    }

    @Override
    public void unExecute() {
        counter.increment();
    }
}
