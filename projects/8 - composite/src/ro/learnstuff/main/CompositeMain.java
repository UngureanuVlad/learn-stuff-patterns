package ro.learnstuff.main;

import ro.learnstuff.implementation.Composite;
import ro.learnstuff.model.ComponentOne;
import ro.learnstuff.model.ComponentTwo;

public class CompositeMain {

	public static void main(String[] args){
		Composite composite = new Composite();
		composite.add(new ComponentOne());
		composite.add(new ComponentTwo());
		composite.work();
	}
}
