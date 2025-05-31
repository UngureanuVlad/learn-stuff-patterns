package io.learnstuff.implementation;

import java.util.Observable;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Enables responding to events, changes or user input.</li>
 * 	<li>Describes the core concept for many modern features and practices.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Observer implements java.util.Observer {

	public void update(Observable obs, Object x) {
		System.out.println("update(" + obs + "," + x + ");");
	}

}
