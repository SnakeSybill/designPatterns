import duck.BlackDuck;
import duck.Duck;
import duck.WhiteDuck;
import behavior.impl.NoQuackBehavior;
import behavior.impl.FlyInARocketBehavior;

public class StrategyTest {
    public static void main(String... args) {
        Duck blackDuck = new BlackDuck();
        blackDuck.setQuackBehavior(new NoQuackBehavior());
        Duck whiteDuck = new WhiteDuck();
        whiteDuck.setFlyBehavior(new FlyInARocketBehavior());

        blackDuck.display();
        blackDuck.performFly();
        blackDuck.performQuack();

        System.out.println();

        whiteDuck.display();
        whiteDuck.performFly();
        whiteDuck.performQuack();
    }
}
