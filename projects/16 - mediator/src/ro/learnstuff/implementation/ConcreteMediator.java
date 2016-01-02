package ro.learnstuff.implementation;

import java.util.ArrayList;

import ro.learnstuff.implementation.contract.Collaborator;
import ro.learnstuff.implementation.contract.Mediator;

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