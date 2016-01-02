package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.OperationStrategy;

public class Strategy {

	private OperationStrategy operationStrategy;
	
	public void setOperationsStrategy(OperationStrategy operationStrategy){
		this.operationStrategy = operationStrategy;
	}
	
	public int estimate(){
		return 5 * operationStrategy.calculate();
	}
	
}
