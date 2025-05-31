package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.TemplateMethod;

public class PublicDevice extends TemplateMethod {

    @Override
    public void start() {
        System.out.println("Public Start!");
    }

    @Override
    public void finish() {
        System.out.println("Public Finish!");
    }

    @Override
    public void task() {
        System.out.println("Public Task!");
    }
}
