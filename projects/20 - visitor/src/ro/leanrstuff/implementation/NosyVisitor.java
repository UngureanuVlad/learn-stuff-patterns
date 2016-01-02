package ro.leanrstuff.implementation;

import ro.leanrstuff.implementation.contract.Visitor;
import ro.leanrstuff.model.ComplexElement;
import ro.leanrstuff.model.SimpleElement;

public class NosyVisitor implements Visitor{

	@Override
	public void visitSimpleElement(SimpleElement simpleElement) {
		System.out.println("Visited simple element!");
	}

	@Override
	public void visitComplexElement(ComplexElement complexElement) {
		System.out.println("Visited complex element!");
		
	}

}

