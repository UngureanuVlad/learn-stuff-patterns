package ro.learnstuff.pitfalls;

import ro.learnstuff.implementation.Singleton;
import ro.learnstuff.utils.StreamOperations;

public class DeserializedSingleton {

	public static void obtainTwoSingletonInstances(){
		StreamOperations.writeObject(new Singleton());
		
		Singleton s1 = StreamOperations.readObject();
		Singleton s2 = StreamOperations.readObject();
		
		System.out.println(s1 + " and " + s2 + " are different instances");
	}
}
