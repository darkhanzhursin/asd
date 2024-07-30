package repo;

import counter.Counter;

public class CounterDAO implements ICounterDAO {

    @Override
    public void save(Counter counter) {
        System.out.println("Saving " + counter);
    }

    @Override
    public void update(Counter counter) {
        System.out.println("Updating counter: " + counter);
    }

    @Override
    public void load(int id) {
        System.out.println("Loading counter: " + id);
    }

    @Override
    public void loadAll() {
        System.out.println("Loading all counters");
    }
}
