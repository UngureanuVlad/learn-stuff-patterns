package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.Worker;

public class Decorator extends Worker {

	Worker worker;
	
	public Decorator(Worker worker){
		this.worker = worker;
	}
	
	public void work(){
		this.worker.work();
	}
}
