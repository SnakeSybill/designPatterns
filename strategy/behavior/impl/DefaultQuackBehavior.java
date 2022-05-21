package behavior.impl;

import behavior.QuackBehavior;

public class DefaultQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("Default quack.");
    }
}
