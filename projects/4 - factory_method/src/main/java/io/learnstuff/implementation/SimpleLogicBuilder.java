package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.LogicalBuilder;
import io.learnstuff.model.ComplexClass;

public class SimpleLogicBuilder implements LogicalBuilder {

    @Override
    public ComplexClass buildComplexClass() {
        return ComplexFactoryMethod.buildComplexClass("Simple One", "Simple Two", "Simple Three");
    }

}
