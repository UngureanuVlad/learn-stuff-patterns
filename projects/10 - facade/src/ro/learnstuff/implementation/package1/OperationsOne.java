package ro.learnstuff.implementation.package1;

import ro.learnstuff.implementation.package2.OperationsTwo;

public class OperationsOne {
	
	public static void operate(OperationsTwo operationsTwo) {
		System.out.println("Operation 1");
		operationsTwo.operate();
	}
}
