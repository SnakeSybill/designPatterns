package observer.impl;

import observer.MyObserver;

public class DevilObserver implements MyObserver {
    public void update() {
        System.out.println("Do it, is going to be fun...");
    }
}