package ro.learnstuff.main;

import ro.learnstuff.implementation.ChainOfResponsability;
import ro.learnstuff.implementation.contract.Processor;

public class ChainOfResponsabilityMain {

	public static void main(String[] args){
		Processor processor = ChainOfResponsability.getProcessor();
		processor.process(1, "A word");
		processor.process(2, "A sound");
		processor.process(3, "An image");
	}
}
