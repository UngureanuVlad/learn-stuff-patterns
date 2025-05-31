package io.learnstuff.model;

import io.learnstuff.implementation.contract.Processor;

public class SoundProcessor extends Processor {

    public SoundProcessor(int type) {
        this.type = type;
    }

    @Override
    public void process(String message) {
        System.out.println("Process sound!");
    }
}
