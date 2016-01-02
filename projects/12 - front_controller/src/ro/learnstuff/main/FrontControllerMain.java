package ro.learnstuff.main;

import ro.learnstuff.implementation.FrontController;

public class FrontControllerMain {

	public static void main(String[] args){
		FrontController.processRequest("home", "otherStatus");
		FrontController.processRequest("home", "authenticated");
	}
}
