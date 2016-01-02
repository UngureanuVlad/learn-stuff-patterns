package ro.learnstuff.pitfalls;

import ro.learnstuff.implementation.contracts.AbstractFactory;
import ro.learnstuff.implementation.contracts.ComplexWorker;
import ro.learnstuff.implementation.contracts.SimpleWorker;
import ro.learnstuff.implementation.model.MedicalComplexWorker;
import ro.learnstuff.implementation.model.MedicalSimpleWorker;

/**
 * 
 * <p>AbstractFactroy hides creation of targeted objects.</p>
 * 
 * <p>Note: complex, blocking or time consuming operations might be hidden from the client in the creation of objects.</p>
 * 
 * @author Vlad Ungureanu
 *
 */
public class SuperMedicalFactory implements AbstractFactory{

	@Override
	public SimpleWorker getSimpleWorker() {
		complexOperation();
		timeConsumingOperation();
		return new MedicalSimpleWorker();
	}

	@Override
	public ComplexWorker getCompleWorker() {
		cpuHeavyOperation();
		blockingOperation();
		return new MedicalComplexWorker();
	}
	
	 private void complexOperation(){
		 System.out.println("Complex operation!");
	 }
	 
	 private void timeConsumingOperation(){
		 System.out.println("Time consuming operation!");
	 }

	 private void cpuHeavyOperation(){
		 System.out.println("CPU heavy operation!");
	 }
	 
	 private void blockingOperation(){
		 System.out.println("Blocking operation!");
	 }

}
