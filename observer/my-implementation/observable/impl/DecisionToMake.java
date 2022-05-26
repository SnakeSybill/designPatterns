package observable.impl;

import observable.MyObservable;
import observer.MyObserver;
import java.util.List;
import java.util.ArrayList;

public class DecisionToMake implements MyObservable {

    private List<MyObserver> observers;

    public DecisionToMake() {
        observers = new ArrayList<>();
    }

    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MyObserver observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (MyObserver observer : observers) {
            observer.update();
        }
    }

    public void shouldIDoIt(String decision) {
        System.out.println("Shoud I do " + decision + "?");
        notifyObservers();
    }
}
