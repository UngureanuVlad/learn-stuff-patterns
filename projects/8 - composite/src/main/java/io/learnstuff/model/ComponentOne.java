package io.learnstuff.model;

import io.learnstuff.implementation.contract.Component;

public class ComponentOne implements Component {

    @Override
    public void work() {
        System.out.println("Work One!");
    }

}
