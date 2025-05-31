package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.LogicalBuilder;
import io.learnstuff.model.ComplexClass;

public class LogicalFactoryMethod {

    public static ComplexClass buildClass(String option) {
        LogicalBuilder logicalBuilder = null;
        switch (option) {
            case "Simple":
                logicalBuilder = new SimpleLogicBuilder();
                break;
            case "Complex":
                logicalBuilder = new ComplexLogicBuilder();
                break;
        }

        return logicalBuilder.buildComplexClass();
    }
}
