package ro.learnstuff.main;

import ro.learnstuff.implementation.ConcreteMediator;
import ro.learnstuff.implementation.contract.Collaborator;
import ro.learnstuff.model.MobileCollaborator;
import ro.learnstuff.model.NetworkCollaborator;

public class MediatorMain {

	public static void main(String[] args){
		ConcreteMediator mediator = new ConcreteMediator();

	    Collaborator network = new NetworkCollaborator(mediator);
	    Collaborator mobile = new MobileCollaborator(mediator);
	    mediator.addCollaborator(network);
	    mediator.addCollaborator(mobile);

	    network.send("Hello network!");
	    mobile.send("Hello mobile!");
	}
}
