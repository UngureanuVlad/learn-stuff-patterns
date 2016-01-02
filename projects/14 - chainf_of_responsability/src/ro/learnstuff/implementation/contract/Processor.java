package ro.learnstuff.implementation.contract;

public abstract class Processor {

	public abstract void process(String message);

	protected int type;

	// next element in chain or responsibility
	protected Processor nextProcessor;

	public void setNextLogger(Processor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

	public void process(int type, String message) {
		if (this.type == type) {
			process(message);
		}
		if (nextProcessor != null) {
			nextProcessor.process(type, message);
		}
	}
}
