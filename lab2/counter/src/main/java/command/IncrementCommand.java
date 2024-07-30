package command;

import service.ICounterService;

public class IncrementCommand implements Command {
    ICounterService counterService;

    public IncrementCommand(ICounterService counterService) {
        this.counterService = counterService;
    }

    @Override
    public void execute() {
        counterService.increment();
    }

    @Override
    public void unExecute() {
        counterService.decrement();
    }
}
