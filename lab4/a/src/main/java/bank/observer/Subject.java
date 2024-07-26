package bank.observer;

import java.util.ArrayList;
import java.util.Collection;

public class Subject implements ISubject {
    private Collection<Observer> observerlist = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observerlist.add(observer);
    }

    public void donotify(){
        for (Observer observer: observerlist){
            if (observer.getClass().equals(EmailSender.class)) continue;
            observer.update();
        }
    }

    @Override
    public void notifyWhenNewAccountCreated() {
        for (Observer observer: observerlist){
            observer.update();
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerlist.remove(observer);
    }
}
