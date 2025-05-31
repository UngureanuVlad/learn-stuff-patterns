package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.AbstractOperations;
import io.learnstuff.implementation.contract.Operations;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Increases implementation complexity.</li>
 * 	<li>There are more efficient (and easier) ways of achieving the same outcome, like the Strategy Pattern.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Bridge extends AbstractOperations {

    public Bridge(Operations operations) {
        super(operations);
    }

}
