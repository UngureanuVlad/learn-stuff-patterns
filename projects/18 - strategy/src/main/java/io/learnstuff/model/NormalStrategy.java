package io.learnstuff.model;

import io.learnstuff.implementation.contract.OperationStrategy;

public class NormalStrategy implements OperationStrategy {

    @Override
    public int calculate() {
        return 5;
    }

}
