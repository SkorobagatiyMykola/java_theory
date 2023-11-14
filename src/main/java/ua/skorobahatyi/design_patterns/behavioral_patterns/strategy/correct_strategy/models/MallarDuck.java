package ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.models;

import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors.FlyWithWings;
import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors.Quack;

public class MallarDuck extends Duck{
    public MallarDuck() {
        flyBehavior= new FlyWithWings();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
