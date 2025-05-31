package io.learnstuff.model;

import io.learnstuff.implementation.contract.Worker;

public class ComplexWorker extends Worker {

    public void work() {
        System.out.print("Complex ");
        super.work();
    }
}
