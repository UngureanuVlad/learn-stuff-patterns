package ro.learnstuff.implementation.model;

import ro.learnstuff.implementation.contracts.SimpleWorker;

public class MedicalSimpleWorker implements SimpleWorker{

	@Override
	public void work() {
		System.out.println("Simple medical work!");
	}

}
