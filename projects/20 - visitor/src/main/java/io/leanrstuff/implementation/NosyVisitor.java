package io.leanrstuff.implementation;

import io.leanrstuff.implementation.contract.Visitor;
import io.leanrstuff.model.ComplexElement;
import io.leanrstuff.model.SimpleElement;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, increasing complexity and risk of unwanted behaviors.</li>
 * 	<li>Can be easily abused or increase too much in complexity.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
public class NosyVisitor implements Visitor {

    @Override
    public void visitSimpleElement(SimpleElement simpleElement) {
        System.out.println("Visited simple element!");
    }

    @Override
    public void visitComplexElement(ComplexElement complexElement) {
        System.out.println("Visited complex element!");

    }

}

