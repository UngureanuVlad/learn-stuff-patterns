package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.OperationStrategy;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Key for managing complex business logic without the need to re-write or re-test.</li>
 * 	<li>Core aspect of Dependency Injection and Inversion of Control frameworks.</li>
 * 	<li>Allows implementations to substitute specific functionalities at runtime, depending on environment, configurations or context.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Strategy {

    private OperationStrategy operationStrategy;

    public void setOperationsStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int estimate() {
        return 5 * operationStrategy.calculate();
    }

}
