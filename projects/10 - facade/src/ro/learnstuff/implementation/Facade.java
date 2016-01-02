package ro.learnstuff.implementation;

import ro.learnstuff.implementation.package1.OperationsOne;
import ro.learnstuff.implementation.package2.OperationsTwo;
import ro.learnstuff.implementation.package3.OperationsThree;

public class Facade {

	public static void operate(){
		OperationsOne.operate(new OperationsTwo());
		OperationsThree.operate();
	}
}
