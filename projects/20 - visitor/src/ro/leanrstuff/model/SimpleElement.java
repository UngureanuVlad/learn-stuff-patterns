package ro.leanrstuff.model;

import ro.leanrstuff.implementation.contract.Visitable;
import ro.leanrstuff.implementation.contract.Visitor;

public class SimpleElement implements Visitable{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSimpleElement(this);
	}

}
