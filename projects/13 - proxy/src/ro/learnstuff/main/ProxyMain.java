package ro.learnstuff.main;


import ro.learnstuff.implementation.DynamicProxy;
import ro.learnstuff.implementation.Proxy;
import ro.learnstuff.implementation.contract.Service;
import ro.learnstuff.model.HeavyService;

public class ProxyMain {

	public static void main(String[] args){
		Proxy proxy =new Proxy();
		
		proxy.perform();
		proxy.perform();
		
		
		Service dynamicProxy = (Service) DynamicProxy.newInstance(new HeavyService());
		dynamicProxy.perform();
	}
}
