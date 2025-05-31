package io.learnstuff.implementation.model;

import io.learnstuff.implementation.contracts.SimpleWorker;

public class FinancialSimpleWorker implements SimpleWorker {

    @Override
    public void work() {
        System.out.println("Simple financial work!");
    }

}
