package service;

import counter.Counter;
import observer.ISubject;

public interface ICounterService extends ISubject {
    void increment();
    void decrement();
}
