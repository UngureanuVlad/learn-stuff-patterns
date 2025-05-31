package io.learnstuff.model;

import io.learnstuff.implementation.contract.Page;

public class LoginPage implements Page {

    @Override
    public void show() {
        System.out.println("Login page!");
    }
}
