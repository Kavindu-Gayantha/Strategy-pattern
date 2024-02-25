package main;

import Strategy.Duck;
import Strategy.MallardDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
        DuckSelector selectedDuck = new DuckSelector();
        Duck duck = selectedDuck.getDuckInstance("Rubber");
        duck.performQuack();
        duck.performFly();
    }
}