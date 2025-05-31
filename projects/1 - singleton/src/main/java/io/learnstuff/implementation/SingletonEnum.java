package io.learnstuff.implementation;

public enum SingletonEnum {
    Instance;

    private SingletonEnum() {
    }

    public void doStuff() {
        System.out.println("Some heavy operation!");
    }

}
