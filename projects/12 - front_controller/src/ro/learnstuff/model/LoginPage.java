package ro.learnstuff.model;

import ro.learnstuff.implementation.contract.Page;

public class LoginPage implements Page{

	@Override
	public void show(){
		System.out.println("Login page!");
	}
}
