package ro.learnstuff.implementation;

import java.util.Observable;

public class Observer implements java.util.Observer {

	public void update(Observable obs, Object x) {
		System.out.println("update(" + obs + "," + x + ");");
	}

}
