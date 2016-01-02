package ro.learnstuff.implementation;

import java.util.HashMap;

import ro.learnstuff.implementation.contract.Service;

public class Flyweight {

	 private static final HashMap<String,Service> services = new HashMap<>();
	 
	    public static Service getService(String type) {
	    	return services.get(type);
	    }
	    
	    public static void addService(String type, Service service){
	    	services.put(type, service);
	    }
}
