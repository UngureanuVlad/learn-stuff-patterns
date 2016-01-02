package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.LogicalBuilder;
import ro.learnstuff.model.ComplexClass;

public class ComplexLogicBuilder implements LogicalBuilder{

	@Override
	public ComplexClass buildComplexClass() {
		return ComplexFactoryMethod.buildComplexClass("Complex One", "Complex Two", "Complex Three");
	}

}
