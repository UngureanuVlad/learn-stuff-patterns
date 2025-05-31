package io.leanrstuff.implementation.contract;

import io.leanrstuff.model.ComplexElement;
import io.leanrstuff.model.SimpleElement;

public interface Visitor {

    void visitSimpleElement(SimpleElement simpleElement);

    void visitComplexElement(ComplexElement complexElement);
}
