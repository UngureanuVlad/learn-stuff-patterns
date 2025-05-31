package io.learnstuff.main;

import io.learnstuff.implementation.ConcreteMediator;
import io.learnstuff.implementation.contract.Collaborator;
import io.learnstuff.model.MobileCollaborator;
import io.learnstuff.model.NetworkCollaborator;

public class MediatorMain {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Collaborator network = new NetworkCollaborator(mediator);
        Collaborator mobile = new MobileCollaborator(mediator);
        mediator.addCollaborator(network);
        mediator.addCollaborator(mobile);

        network.send("Hello network!");
        mobile.send("Hello mobile!");
    }
}
