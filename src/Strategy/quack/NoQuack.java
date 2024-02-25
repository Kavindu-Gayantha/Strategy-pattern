package Strategy.quack;

public class NoQuack implements QuackBehavior{
    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("silent , no sound");
    }
}
