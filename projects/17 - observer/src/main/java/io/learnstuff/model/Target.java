package io.learnstuff.model;

import io.learnstuff.implementation.contract.CustomObserver;

import java.util.ArrayList;
import java.util.List;

public class Target {
	private List<CustomObserver> observers = new ArrayList<CustomObserver>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(CustomObserver observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (CustomObserver observer : observers) {
			observer.update();
		}
	}
}
