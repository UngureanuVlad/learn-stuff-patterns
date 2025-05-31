package io.learnstuff.main;

import io.learnstuff.implementation.Singleton;
import io.learnstuff.implementation.SingletonEnum;
import io.learnstuff.pitfalls.DeserializedSingleton;

public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("First call:");
        Singleton.getHeavyResource().heavyOperation();

        System.out.println("Second call:");
        Singleton.getHeavyResource().heavyOperation();

        System.out.println("Other type of singleton: ");
        SingletonEnum.Instance.doStuff();

        System.out.println("Deserialized singleton:");
        DeserializedSingleton.obtainTwoSingletonInstances();
    }
}
