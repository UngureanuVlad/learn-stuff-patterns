package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.LogicalBuilder;
import ro.learnstuff.model.ComplexClass;

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
