import observable.MyObservable;
import observable.impl.DecisionToMake;
import observer.impl.*;
import observer.*;

public class MyObserverTest {
    public static void main(String[] args) {
        DecisionToMake observable = new DecisionToMake();
        MyObserver angel = new AngelObserver();
        MyObserver devil = new DevilObserver();

        observable.addObserver(angel);
        observable.addObserver(devil);

        String decision = "a different haircut";
        System.out.println();
        observable.shouldIDoIt(decision);

        System.out.println();
        System.out.println("... after some beer ...");
        System.out.println();

        // Forget this guy
        observable.removeObserver(angel);

        observable.shouldIDoIt(decision);
    }
}
