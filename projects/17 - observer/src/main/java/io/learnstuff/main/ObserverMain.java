package io.learnstuff.main;

import io.learnstuff.implementation.Observer;
import io.learnstuff.implementation.PropertyChangeObserver;
import io.learnstuff.implementation.ValueChangeObserver;
import io.learnstuff.model.ObservableTarget;
import io.learnstuff.model.Target;

public class ObserverMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// custom observer
		Target target = new Target();

		PropertyChangeObserver propertyChangeObserver = new PropertyChangeObserver(target);
		ValueChangeObserver valueChangeObserver = new ValueChangeObserver(target);
		System.out.println("First state change: 15");
		target.setState(15);

		// language specific observer
		ObservableTarget observableTarget = new ObservableTarget();
		observableTarget.addObserver(new Observer());
		observableTarget.changeSomething(5);
	}
}
