package io.learnstuff.implementation;

import io.learnstuff.implementation.contact.Operations;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Encapsulate all required information for performing business logic actions.</li>
 * 	<li>Enables passing, delegating or moving responsibility for an action to the most appropriate part of the code.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class Command {

    private Operations operations;

    public void setCommand(Operations operations) {
        this.operations = operations;
    }

    public void execute() {
        operations.execute();

    }
}
