package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Service;

public class NiceService implements Service {

	@Override
	public void perform() {
		System.out.println("Nice service performed!");
	}

}
