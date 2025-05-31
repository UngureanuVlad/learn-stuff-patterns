package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.Page;
import io.learnstuff.model.HomePage;
import io.learnstuff.model.LoginPage;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {

    public static Map<String, Page> pages = new HashMap<>();

    public Dispatcher() {
        pages.put("home", new HomePage());
        pages.put("login", new LoginPage());
    }

    public void dispatch(String request) {
        pages.get(request).show();
    }
}
