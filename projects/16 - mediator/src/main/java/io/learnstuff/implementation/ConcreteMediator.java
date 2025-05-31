package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Collaborator;
import io.learnstuff.implementation.contract.Mediator;

import java.util.ArrayList;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Enhanced control over how objects interact.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class ConcreteMediator implements Mediator {

    private ArrayList<Collaborator> collaborators;

    public ConcreteMediator() {
        collaborators = new ArrayList<Collaborator>();

    }

    public void addCollaborator(Collaborator collaborator) {
        collaborators.add(collaborator);

    }

    public void sendMessage(String message, Collaborator originator) {
        for (Collaborator collaborator : collaborators) {
            if (collaborator != originator) {
                collaborator.receive(message);
            }
        }
    }


}
