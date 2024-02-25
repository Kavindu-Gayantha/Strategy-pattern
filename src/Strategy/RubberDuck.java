package Strategy;

import Strategy.fly.FlyNoWay;
import Strategy.quack.NoQuack;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new NoQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("this is rubber duck");
    }
}
