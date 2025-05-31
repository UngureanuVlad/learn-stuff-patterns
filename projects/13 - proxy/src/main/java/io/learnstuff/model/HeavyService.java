package io.learnstuff.model;

import io.learnstuff.implementation.contract.Service;

public class HeavyService implements Service {

    @Override
    public void perform() {
        System.out.println("Service performed!");
    }

}
