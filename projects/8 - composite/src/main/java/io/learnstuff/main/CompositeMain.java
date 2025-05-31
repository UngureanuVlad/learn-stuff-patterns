package io.learnstuff.main;

import io.learnstuff.implementation.Composite;
import io.learnstuff.model.ComponentOne;
import io.learnstuff.model.ComponentTwo;

public class CompositeMain {

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.add(new ComponentOne());
        composite.add(new ComponentTwo());
        composite.work();
    }
}
