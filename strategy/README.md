# Strategy

## About the pattern

Strategy is a pattern where we isolate behaviors (such as methods) that can change in the future in a set of classes and inject thoses behaviors in the main class using interfaces.

That way, the main class only depends of the definition of the behavior, and we can change the behavior of an instance dinamically. 
In addition, we use inheritance only for things that will not change in the future

## About the project

In this project, we have an abstract class ```Duck```, and two subclasses of it: ```WhiteDuck``` and ```BlackDuck```.
The ```Duck``` class has two dynamic behaviors: ```flyBehavior``` and ```quackBehavior```, of the types  ```FlyBehavior``` and ```QuackBehavior```, both interfaces.

We can change the behavior of the ```Duck``` objects by setting the properties ```flyBehavior``` and ```quackBehavior``` during runtime, as we can see in the class ```StrategyTest.java```.

To add a different flying or quacking behavior we just need to create a new class who implements ```FlyBehavior``` and ```QuackBehavior``` and set this new type on an instance of a ```Duck``` object.

Ooh, and we also have the method ```display```, on the ```Duck``` class, who shows that we still can use inheritance in our subclasses for things that doesn't change.

### Reference
This is an example showed in the first chapter of the book [Head First Design Patterns: A Brain-Friendly Guide](https://www.amazon.com.br/Head-First-Design-Patterns-Freeman/dp/0596007124/ref=pd_lpo_1?pd_rd_i=0596007124&psc=1).