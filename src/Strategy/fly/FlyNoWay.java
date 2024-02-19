package Strategy.fly;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println(" Can not fly");
    }
}
