package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contracts.ComplexWorker;
import ro.learnstuff.implementation.contracts.SimpleWorker;
import ro.learnstuff.implementation.contracts.AbstractFactory;
import ro.learnstuff.implementation.model.FinancialComplexWorker;
import ro.learnstuff.implementation.model.FinancialSimpleWorker;

/**
 * <p>Concrete implementation of AbstractFactory</p>
 * 
 * @author Vlad Ungureanu
 *
 */
public class FinancialFactory implements AbstractFactory {

	@Override
	public SimpleWorker getSimpleWorker() {
		return new FinancialSimpleWorker();
	}

	@Override
	public ComplexWorker getCompleWorker() {
		return new FinancialComplexWorker();
	}

}
