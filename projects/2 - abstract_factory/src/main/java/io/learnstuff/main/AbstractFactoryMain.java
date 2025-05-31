package io.learnstuff.main;

import io.learnstuff.implementation.FinancialFactory;
import io.learnstuff.implementation.MedicalFactory;
import io.learnstuff.implementation.contracts.AbstractFactory;
import io.learnstuff.pitfalls.SuperMedicalFactory;

/**
 * <p>Considerations:</p>
 * <ul>
 * 		<li>Adding a new type of object to the factory requires refactoring.</li>
 * 		<li>Creation of objects might hide complex operations.</li>
 * 		<li>Abstract factory implementation adds extra work especially in the first stages of development.</li>
 * 		<li>Adds a layer of abstraction to the code.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class AbstractFactoryMain {

    // values: Medical, Pitfalls and Financial
    public static final String DOMAIN = "Medical";

    // this acts like client code for AbstractFactory implementation
    public static void main(String[] args) {

        AbstractFactory workerCreater = getDomainSpecificFactory();
        // use resulted objects
        workerCreater.getSimpleWorker().work();
        workerCreater.getComplexWorker().work();
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
