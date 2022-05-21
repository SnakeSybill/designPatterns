package behavior.impl;

import behavior.QuackBehavior;

public class NoQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("... silence ...");
    }
}
