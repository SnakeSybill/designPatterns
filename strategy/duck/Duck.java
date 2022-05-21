package duck;

import behavior.FlyBehavior;
import behavior.impl.DefaultFlyBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    public Duck() {
        flyBehavior = new DefaultFlyBehavior();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void quack() {
        System.out.println("Default quack.");
    }

    public abstract void display();
}
