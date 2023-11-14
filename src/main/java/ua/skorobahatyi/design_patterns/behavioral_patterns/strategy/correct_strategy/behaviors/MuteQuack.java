package ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<?? Silence>>");
    }
}
