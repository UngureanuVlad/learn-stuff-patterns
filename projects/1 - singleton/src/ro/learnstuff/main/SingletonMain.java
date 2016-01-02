package ro.learnstuff.main;

import ro.learnstuff.implementation.Singleton;
import ro.learnstuff.implementation.SingletonEnum;
import ro.learnstuff.pitfalls.DeserializedSingleton;

public class SingletonMain {

	public static void main (String[] args){
		System.out.println("First call:");
		Singleton.getHeavyResource().heavyOperation();
		
		System.out.println("Second call:");
		Singleton.getHeavyResource().heavyOperation();
		
		System.out.println("Other type of singleton: ");
		SingletonEnum.Instance.dostuff();
		
		System.out.println("Deserialized singleton:");
		DeserializedSingleton.obtainTwoSingletonInstances();
	}
}
