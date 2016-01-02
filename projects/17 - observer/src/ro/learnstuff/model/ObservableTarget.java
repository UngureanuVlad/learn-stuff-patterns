package ro.learnstuff.model;

import java.util.Observable;

public class ObservableTarget extends Observable {

	public void changeSomething(int value) {
		setChanged();
		notifyObservers(value);
	}
}
