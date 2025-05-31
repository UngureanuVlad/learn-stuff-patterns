package io.learnstuff.implementation.package1;

import io.learnstuff.implementation.package2.OperationsTwo;

public class OperationsOne {

    public static void operate(OperationsTwo operationsTwo) {
        System.out.println("Operation 1");
        operationsTwo.operate();
    }
}
