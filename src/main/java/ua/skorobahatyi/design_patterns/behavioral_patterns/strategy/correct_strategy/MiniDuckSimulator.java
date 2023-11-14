package ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy;

import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.behaviors.FlyRocketPowered;
import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.models.Duck;
import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.models.MallarDuck;
import ua.skorobahatyi.design_patterns.behavioral_patterns.strategy.correct_strategy.models.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard= new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model= new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
