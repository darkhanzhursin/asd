package command;

import service.ICounterService;

public class DecrementCommand implements Command {

    ICounterService counterService;
    public DecrementCommand(ICounterService counterService) {
        this.counterService = counterService;
    }

    @Override
    public void execute() {
        counterService.decrement();
    }

    @Override
    public void unExecute() {
        counterService.increment();
    }
}
