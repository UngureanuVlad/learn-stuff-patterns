package ro.learnstuff.main;

import ro.learnstuff.implementation.Strategy;
import ro.learnstuff.model.ComplexStrategy;
import ro.learnstuff.model.NormalStrategy;

public class StrategyMain {

	public static void main(String[] args){
		Strategy strategy = new Strategy();
		strategy.setOperationsStrategy(new NormalStrategy());
		System.out.println("Normal estimate: " + strategy.estimate());
		
		strategy.setOperationsStrategy(new ComplexStrategy());
		System.out.println("Complex estimate: " + strategy.estimate());
	}
}
