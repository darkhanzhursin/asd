package observer;

public interface ISubject {

    void addObserver(Observer observer);
    void donotify(int counter);
}
