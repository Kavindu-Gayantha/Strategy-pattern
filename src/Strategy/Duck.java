package Strategy;

import Strategy.fly.FlyBehaviour;
import Strategy.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public abstract void display();
}
