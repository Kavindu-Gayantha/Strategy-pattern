package main;

import Strategy.Duck;
import Strategy.MallardDuck;
import Strategy.RedHeadDuck;
import Strategy.RubberDuck;

public class DuckSelector {

    Duck getDuckInstance(String duckType) {
        switch (duckType) {
            case "Mallad":
                return new MallardDuck();

            case "RedHead":
                return new RedHeadDuck();

            default:
                return new RubberDuck();
        }
    }
}
