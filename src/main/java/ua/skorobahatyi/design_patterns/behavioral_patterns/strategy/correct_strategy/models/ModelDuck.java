package ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.models;

import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors.FlyNoWay;
import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
