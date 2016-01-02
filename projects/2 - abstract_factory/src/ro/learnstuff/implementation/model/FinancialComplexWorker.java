package ro.learnstuff.implementation.model;

import ro.learnstuff.implementation.contracts.ComplexWorker;

public class FinancialComplexWorker implements ComplexWorker{

	@Override
	public void work() {
		System.out.println("Complex finacial work!");
	}

}
