package ro.learnstuff.main;

import ro.learnstuff.implementation.ComplexPrototype;

public class PrototypeMain {

	public static void main(String[] args) {

		ComplexPrototype complexPrototype = new ComplexPrototype();
		complexPrototype.complexProcess();
		
		ComplexPrototype complexPrototype2 = (ComplexPrototype) complexPrototype.instance();
		complexPrototype2.complexProcess();
	}

}
