import duck.BlackDuck;
import duck.Duck;
import duck.WhiteDuck;

public class StrategyTest {
    public static void main(String... args) {
        Duck blackDuck = new BlackDuck();
        Duck whiteDuck = new WhiteDuck();

        blackDuck.display();
        blackDuck.performFly();
        blackDuck.performQuack();

        System.out.println();

        whiteDuck.display();
        whiteDuck.performFly();
        whiteDuck.performQuack();
    }
}
