package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Processor;

public class ImageProcessor extends Processor {

	public ImageProcessor(int type) {
		this.type = type;
	}

	@Override
	public void process(String message) {
		System.out.println("Process image!");
	}
}
