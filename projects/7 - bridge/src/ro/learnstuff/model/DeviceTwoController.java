package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Operations;

public class DeviceTwoController implements Operations{

	@Override
	public void turnOn() {
		System.out.println("Type two - turn on!");
	}

	@Override
	public void turnOff() {
		System.out.println("Type two - turn off!");
	}

}
