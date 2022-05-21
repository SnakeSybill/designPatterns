public class StrategyTest {
    public static void main(String... args){
        Duck blackDuck = new BlackDuck();
        Duck whiteDuck = new WhiteDuck();

        blackDuck.display();
        blackDuck.fly();
        blackDuck.quack();
        
        System.out.println();
        
        whiteDuck.display();
        whiteDuck.fly();
        whiteDuck.quack();
    }
}
