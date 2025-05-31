package io.learnstuff.model;

import io.learnstuff.implementation.contract.Component;

public class ComponentTwo implements Component {

    @Override
    public void work() {
        System.out.println("Work Two!");
    }

}
