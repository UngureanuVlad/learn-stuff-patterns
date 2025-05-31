package io.learnstuff.main;

import io.learnstuff.implementation.Decorator;
import io.learnstuff.implementation.InheritenceDecorator;
import io.learnstuff.model.ComplexWorker;
import io.learnstuff.model.SimpleWorker;

public class DecoratorMain {

    public static void main(String[] args) {
        InheritenceDecorator decorator = new InheritenceDecorator();
        decorator.doExtendedWork();

        Decorator decoratorOne = new Decorator(new SimpleWorker());
        decoratorOne.work();
        Decorator decoratorTwo = new Decorator(new ComplexWorker());
        decoratorTwo.work();
    }
}

