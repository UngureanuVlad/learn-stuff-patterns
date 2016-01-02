package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.Processor;
import ro.learnstuff.model.ImageProcessor;
import ro.learnstuff.model.SoundProcessor;
import ro.learnstuff.model.WordProcessor;

public class ChainOfResponsability {

	public static Processor getProcessor(){
		Processor wordProcessor = new WordProcessor(1);
		Processor soundProcessor = new SoundProcessor(2);
		Processor imageProcessor = new ImageProcessor(3);
		
		wordProcessor.setNextLogger(soundProcessor);
		soundProcessor.setNextLogger(imageProcessor);
		
		return wordProcessor;
	}
}
