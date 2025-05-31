package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.LogicalBuilder;
import io.learnstuff.model.ComplexClass;

public class ComplexLogicBuilder implements LogicalBuilder {

    @Override
    public ComplexClass buildComplexClass() {
        return ComplexFactoryMethod.buildComplexClass("Complex One", "Complex Two", "Complex Three");
    }

}
