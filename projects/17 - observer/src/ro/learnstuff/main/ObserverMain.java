package ro.learnstuff.main;

import ro.learnstuff.implementation.Observer;
import ro.learnstuff.implementation.PropertyChangeObserver;
import ro.learnstuff.implementation.ValueChangeObserver;
import ro.learnstuff.model.ObservableTarget;
import ro.learnstuff.model.Target;

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
