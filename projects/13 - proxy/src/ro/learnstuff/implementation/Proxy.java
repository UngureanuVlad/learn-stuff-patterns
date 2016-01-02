package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.Service;
import ro.learnstuff.model.HeavyService;

public class Proxy implements Service{

	HeavyService heavyService = null;
	
	@Override
	public void perform() {
		if (heavyService == null){
			System.out.println("Create Heavy Service!");
			heavyService = new HeavyService();
		} else {
			System.out.println("Heavy Service already created!");
		}
		heavyService.perform();
	}
}
