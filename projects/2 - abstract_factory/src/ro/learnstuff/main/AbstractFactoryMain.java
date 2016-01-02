package ro.learnstuff.main;

import ro.learnstuff.implementation.FinancialFactory;
import ro.learnstuff.implementation.MedicalFactory;
import ro.learnstuff.implementation.contracts.AbstractFactory;
import ro.learnstuff.pitfalls.SuperMedicalFactory;

/**
 * <p>Common pitfalls:</p>
 * <ul>
 * 		<li>Adding a new type of object to the factory requires refactorying.</li>
 * 		<li>Creation of objects might hide complex operations.</li>
 * 		<li>Abstract factory implementation adds extra work especially in the first stages of development.</li>
 * 		<li>Adds an layer of abstraction to the code.</li>
 * </ul>
 * 
 * @author Vlad Ungureanu
 *
 */
public class AbstractFactoryMain {

	// values: Medical, Pitfalls and Financial
	public static final String DOMAIN = "Medical";

	// this acts like client code for AbstractFactory implementation
	public static void main(String[] args) {

		AbstractFactory workerCreater = getDomainSpecificFactory();
		// use resulted objects
		workerCreater.getSimpleWorker().work();
		workerCreater.getCompleWorker().work();
	}

	// let code decide what factory would be created and used
	private static AbstractFactory getDomainSpecificFactory() {
		if ("Pitfalls".equals(DOMAIN)) {
			return new SuperMedicalFactory();
		} else if ("Medical".equals(DOMAIN)) {
			return new MedicalFactory();
		} else {
			return new FinancialFactory();
		}
	}
}
