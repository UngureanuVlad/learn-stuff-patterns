package ro.learnstuff.main;

import ro.learnstuff.implementation.Decorator;
import ro.learnstuff.implementation.InheritenceDecorator;
import ro.learnstuff.model.ComplexWorker;
import ro.learnstuff.model.SimpleWorker;

public class DecoratorMain {

	public static void main(String[] args){
		InheritenceDecorator decorator = new InheritenceDecorator();
		decorator.doExtendedWork();
		
		Decorator decoratorOne = new Decorator(new SimpleWorker());
		decoratorOne.work();
		Decorator decoratorTwo = new Decorator(new ComplexWorker());
		decoratorTwo.work();
	}
}

