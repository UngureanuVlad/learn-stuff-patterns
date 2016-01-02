package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Collaborator;
import ro.learnstuff.implementation.contract.Mediator;

public class NetworkCollaborator extends Collaborator{

	public NetworkCollaborator(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String message) {
		System.out.println("Network collaborator received: " + message);
	}

}
