package bank.observer;

public interface ISubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void donotify();
    void notifyWhenNewAccountCreated();
}
