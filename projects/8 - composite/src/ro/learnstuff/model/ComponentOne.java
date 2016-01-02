package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Component;

public class ComponentOne implements Component{

	@Override
	public void work() {
		System.out.println("Work One!");
	}

}
