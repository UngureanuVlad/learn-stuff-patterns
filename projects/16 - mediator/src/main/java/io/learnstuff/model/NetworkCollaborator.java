package io.learnstuff.model;

import io.learnstuff.implementation.contract.Collaborator;
import io.learnstuff.implementation.contract.Mediator;

public class NetworkCollaborator extends Collaborator {

    public NetworkCollaborator(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Network collaborator received: " + message);
    }

}
