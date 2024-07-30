package repo;

import counter.Counter;

public interface ICounterDAO {
    void save(Counter counter);
    void update(Counter counter);
    void load(int id);
    void loadAll();
}
