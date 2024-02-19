package Strategy.fly;

import Strategy.fly.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        //fly with wings
        System.out.println("Fly with wings");
    }
}
