package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Component;

public class ComponentTwo implements Component {

	@Override
	public void work() {
		System.out.println("Work Two!");
	}

}
