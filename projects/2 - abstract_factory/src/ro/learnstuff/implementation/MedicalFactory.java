package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contracts.ComplexWorker;
import ro.learnstuff.implementation.contracts.SimpleWorker;
import ro.learnstuff.implementation.contracts.AbstractFactory;
import ro.learnstuff.implementation.model.MedicalComplexWorker;
import ro.learnstuff.implementation.model.MedicalSimpleWorker;

/**
 * <p>Concrete implementation of AbstractFactory</p>
 * 
 * @author Vlad Ungureanu
 *
 */
public class MedicalFactory implements AbstractFactory {

	@Override
	public SimpleWorker getSimpleWorker() {
		return new MedicalSimpleWorker();
	}

	@Override
	public ComplexWorker getCompleWorker() {
		return new MedicalComplexWorker();
	}
	
}
