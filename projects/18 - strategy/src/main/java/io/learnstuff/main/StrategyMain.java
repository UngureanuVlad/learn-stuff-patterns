package io.learnstuff.main;

import io.learnstuff.implementation.Strategy;
import io.learnstuff.model.ComplexStrategy;
import io.learnstuff.model.NormalStrategy;

public class StrategyMain {

    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        strategy.setOperationsStrategy(new NormalStrategy());
        System.out.println("Normal estimate: " + strategy.estimate());

        strategy.setOperationsStrategy(new ComplexStrategy());
        System.out.println("Complex estimate: " + strategy.estimate());
    }
}
