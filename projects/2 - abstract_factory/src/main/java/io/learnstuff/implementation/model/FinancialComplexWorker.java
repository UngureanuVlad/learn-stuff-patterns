package io.learnstuff.implementation.model;

import io.learnstuff.implementation.contracts.ComplexWorker;

public class FinancialComplexWorker implements ComplexWorker {

    @Override
    public void work() {
        System.out.println("Complex financial work!");
    }

}
