package ro.learnstuff.implementation.contract;

public abstract class AbstractOperations {

	private Operations operations;
	
	public AbstractOperations(Operations operations){
		this.operations = operations;
	}
	
	public void turnOn(){
		this.operations.turnOn();
	}
	
	public void turnOff(){
		this.operations.turnOff();
	}
}
