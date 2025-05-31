package io.learnstuff.main;

import io.learnstuff.implementation.ChainOfResponsibility;
import io.learnstuff.implementation.contract.Processor;

public class ChainOfResponsabilityMain {

    public static void main(String[] args) {
        Processor processor = ChainOfResponsibility.getProcessor();
        processor.process(1, "A word");
        processor.process(2, "A sound");
        processor.process(3, "An image");
    }
}
