package observer.impl;

import observer.MyObserver;

public class AngelObserver implements MyObserver {
    public void update() {
        System.out.println("Don't do it, you might regret...");
    }
}
