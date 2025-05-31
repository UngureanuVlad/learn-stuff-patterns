package io.learnstuff.implementation.contract;

import io.learnstuff.model.Target;

public abstract class CustomObserver {

	protected Target target;

	public abstract void update();
}
