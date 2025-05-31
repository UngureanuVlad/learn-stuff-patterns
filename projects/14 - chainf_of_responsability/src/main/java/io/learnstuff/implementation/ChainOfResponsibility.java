package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Processor;
import io.learnstuff.model.ImageProcessor;
import io.learnstuff.model.SoundProcessor;
import io.learnstuff.model.WordProcessor;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Composable business logic.</li>
 * 	<li>High degree of reusability, control and ease of testing.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class ChainOfResponsibility {

    public static Processor getProcessor() {
        Processor wordProcessor = new WordProcessor(1);
        Processor soundProcessor = new SoundProcessor(2);
        Processor imageProcessor = new ImageProcessor(3);

        wordProcessor.setNextLogger(soundProcessor);
        soundProcessor.setNextLogger(imageProcessor);

        return wordProcessor;
    }
}
