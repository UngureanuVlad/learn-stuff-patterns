package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Collaborator;
import ro.learnstuff.implementation.contract.Mediator;

public class MobileCollaborator extends Collaborator {

	public MobileCollaborator(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String message) {
		System.out.println("Mobile collaborator received: " + message);
	}

}
