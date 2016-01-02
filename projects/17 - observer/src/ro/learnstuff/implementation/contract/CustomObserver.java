package ro.learnstuff.implementation.contract;

import ro.learnstuff.model.Target;

public abstract class CustomObserver {

	protected Target target;

	public abstract void update();
}
