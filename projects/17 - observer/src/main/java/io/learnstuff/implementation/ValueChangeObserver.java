package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.CustomObserver;
import io.learnstuff.model.Target;

public class ValueChangeObserver extends CustomObserver {

	public ValueChangeObserver(Target target) {
		this.target = target;
		this.target.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Value : " +(target.getState()));
	}

}
