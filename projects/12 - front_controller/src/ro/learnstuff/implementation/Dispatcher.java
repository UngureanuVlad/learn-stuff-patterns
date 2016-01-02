package ro.learnstuff.implementation;

import java.util.HashMap;
import java.util.Map;

import ro.learnstuff.implementation.contract.Page;
import ro.learnstuff.model.HomePage;
import ro.learnstuff.model.LoginPage;

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
