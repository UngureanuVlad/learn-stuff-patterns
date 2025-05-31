package io.learnstuff.model;

import io.learnstuff.implementation.contract.Service;

public class NiceService implements Service {

    @Override
    public void perform() {
        System.out.println("Nice service performed!");
    }

}
