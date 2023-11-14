package ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors;

import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
