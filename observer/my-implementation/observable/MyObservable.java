package observable;

import observer.MyObserver;

public interface MyObservable {
    void addObserver(MyObserver observer);

    void removeObserver(MyObserver observer);

    void notifyObservers();
}