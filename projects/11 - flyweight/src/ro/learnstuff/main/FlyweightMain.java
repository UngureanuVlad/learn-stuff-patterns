package ro.learnstuff.main;

import ro.learnstuff.implementation.Flyweight;
import ro.learnstuff.implementation.contract.Service;
import ro.learnstuff.model.GreatService;
import ro.learnstuff.model.NiceService;

public class FlyweightMain {

	public static void main(String[] args){
		Flyweight.addService("nice", new NiceService());
		Flyweight.addService("great", new GreatService());
		
		Service service = Flyweight.getService("nice");
		service.perform();
	}
}
