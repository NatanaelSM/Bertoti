package org.example;

public interface ISubject {
    void subscriber(IObserver obs);
    void unSubscriber(IObserver obs);
    void subscriberAll();
    void notifyObserver(IObserver obs);
    void notifyAllObservers();
}
