package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Service;

public class HeavyService implements Service {

	@Override
	public void perform() {
		System.out.println("Service performed!");
	}

}
