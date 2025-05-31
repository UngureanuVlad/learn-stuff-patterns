package io.leanrstuff.model;

import io.leanrstuff.implementation.contract.Visitable;
import io.leanrstuff.implementation.contract.Visitor;

public class SimpleElement implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSimpleElement(this);
    }

}
