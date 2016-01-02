package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contact.Operations;

public class Command {

	private Operations operations;

	public void setCommand(Operations operations) {
		this.operations = operations;
	}

	public void execute() {
		operations.execute();

	}
}
