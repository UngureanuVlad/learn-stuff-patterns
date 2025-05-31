package io.learnstuff.implementation;

import io.learnstuff.implementation.package1.OperationsOne;
import io.learnstuff.implementation.package2.OperationsTwo;
import io.learnstuff.implementation.package3.OperationsThree;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Implementation is often the logical solution when implementing the "Service Layer" of an application.</li>
 * 	<li>Implementation may hide unwanted or unwanted behaviors.</li>
 * 	<li>Some implementation are shallow, containing no explicit value aside from reducing complexity of method calls.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Facade {

    public static void operate() {
        OperationsOne.operate(new OperationsTwo());
        OperationsThree.operate();
    }
}
