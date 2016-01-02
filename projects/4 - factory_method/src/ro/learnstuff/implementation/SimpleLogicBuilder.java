package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.LogicalBuilder;
import ro.learnstuff.model.ComplexClass;

public class SimpleLogicBuilder implements LogicalBuilder{

	@Override
	public ComplexClass buildComplexClass() {
		return ComplexFactoryMethod.buildComplexClass("Simple One", "Simple Two", "Simple Three");
	}

}
