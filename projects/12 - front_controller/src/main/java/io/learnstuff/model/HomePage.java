package io.learnstuff.model;

import io.learnstuff.implementation.contract.Page;

public class HomePage implements Page {

    @Override
    public void show() {
        System.out.println("Home page!");
    }
}
