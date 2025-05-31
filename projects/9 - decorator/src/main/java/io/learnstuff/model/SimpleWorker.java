package io.learnstuff.model;

import io.learnstuff.implementation.contract.Worker;

public class SimpleWorker extends Worker {

    public void work() {
        System.out.print("Simple ");
        super.work();
    }
}
