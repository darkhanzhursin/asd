package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Subject implements ISubject {
    private Collection<Observer> observerlist = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observerlist.add(observer);
    }

    public void donotify(int counter){
        for (Observer observer: observerlist){
            observer.update(counter);
        }
    }
}
