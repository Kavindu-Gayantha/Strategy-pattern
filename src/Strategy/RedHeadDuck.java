package Strategy;

import Strategy.fly.FlyWithWings;
import Strategy.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehavior = new Quack();
    }


    /**
     *
     */
    @Override
    public void display() {
        System.out.println("red head duck display");
    }
}
