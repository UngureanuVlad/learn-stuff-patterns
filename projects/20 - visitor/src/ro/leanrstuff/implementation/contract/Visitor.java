package ro.leanrstuff.implementation.contract;

import ro.leanrstuff.model.ComplexElement;
import ro.leanrstuff.model.SimpleElement;

public interface Visitor {

	void visitSimpleElement(SimpleElement simpleElement);
	
	void visitComplexElement(ComplexElement complexElement);
}
