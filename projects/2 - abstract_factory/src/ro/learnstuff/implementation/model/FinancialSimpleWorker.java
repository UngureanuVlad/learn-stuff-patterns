package ro.learnstuff.implementation.model;

import ro.learnstuff.implementation.contracts.SimpleWorker;

public class FinancialSimpleWorker implements SimpleWorker{

	@Override
	public void work() {
		System.out.println("Simple finacial work!");
	}

}
