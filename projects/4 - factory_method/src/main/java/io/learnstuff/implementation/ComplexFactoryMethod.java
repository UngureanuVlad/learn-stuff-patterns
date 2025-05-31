package io.learnstuff.implementation;

import io.learnstuff.model.ComplexClass;

public class ComplexFactoryMethod {

    public static String buildPartThroughComplexProcess(String content) {
        return content;
    }

    public static ComplexClass buildComplexClass(String one, String two, String three) {
        ComplexClass complexClass = new ComplexClass();
        complexClass.setComplexPartOne(buildPartThroughComplexProcess(one));
        complexClass.setComplexPartTwo(buildPartThroughComplexProcess(two));
        complexClass.setComplexPartThree(buildPartThroughComplexProcess(three));
        return complexClass;
    }

}
