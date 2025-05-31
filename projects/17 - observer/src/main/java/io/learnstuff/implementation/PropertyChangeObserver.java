package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.CustomObserver;
import io.learnstuff.model.Target;

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
