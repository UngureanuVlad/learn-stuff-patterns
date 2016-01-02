package ro.learnstuff.main;

import ro.learnstuff.implementation.Bridge;
import ro.learnstuff.implementation.contract.Operations;
import ro.learnstuff.model.DeviceOneController;
import ro.learnstuff.model.DeviceTwoController;

/**
 * 
 * @author Vlad Ungureanu
 *
 */
public class BridgeMain {

	public static void main(String[] args) {
		// class with Device One operations
		Operations operationsOne = new DeviceOneController();
		Bridge bridgeOne = new Bridge(operationsOne);
		bridgeOne.turnOn();
		bridgeOne.turnOff();
		
		// same class with Device Two operations
		Operations operationsTwo = new DeviceTwoController();
		Bridge bridgeTwo = new Bridge(operationsTwo);
		bridgeTwo.turnOn();
		bridgeTwo.turnOff();
	}
}
