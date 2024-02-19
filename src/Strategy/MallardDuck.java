package Strategy;

import Strategy.fly.FlyWithWings;
import Strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("mallard Duck display");
    }
}
