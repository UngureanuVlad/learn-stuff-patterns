package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Processor;

public class WordProcessor extends Processor {

	public WordProcessor(int type) {
		this.type = type;
	}

	@Override
	public void process(String message) {
		System.out.println("Process word!");
	}
}
