package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.OperationStrategy;

public class ComplexStrategy implements OperationStrategy{

	@Override
	public int calculate() {
		return 10;
	}

}
