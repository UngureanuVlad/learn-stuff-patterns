package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.CustomObserver;
import ro.learnstuff.model.Target;

public class PropertyChangeObserver extends CustomObserver {

	public PropertyChangeObserver(Target target) {
		this.target = target;
		this.target.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Property : " +(target.getState()));
	}

}
