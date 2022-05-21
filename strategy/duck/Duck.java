package duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;
import behavior.impl.DefaultFlyBehavior;
import behavior.impl.DefaultQuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
        flyBehavior = new DefaultFlyBehavior();
        quackBehavior = new DefaultQuackBehavior();
    }

    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior) {
        quackBehavior = newQuackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();
}
