package ro.learnstuff.implementation.contract;

public abstract class Collaborator {

	private Mediator mediator;

	public Collaborator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void send(String message) {
		mediator.sendMessage(message, this);
	}

	public Mediator getMediator() {
		return mediator;
	}

	public abstract void receive(String message);
}
