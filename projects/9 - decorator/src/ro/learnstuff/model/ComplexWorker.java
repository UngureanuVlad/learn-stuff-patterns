package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Worker;

public class ComplexWorker extends Worker{

	public void work(){
		System.out.print("Complex ");
		super.work();
	}
}
