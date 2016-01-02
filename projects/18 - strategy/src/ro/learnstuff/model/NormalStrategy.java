package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.OperationStrategy;

public class NormalStrategy implements OperationStrategy{

	@Override
	public int calculate() {
		return 5;
	}

}
