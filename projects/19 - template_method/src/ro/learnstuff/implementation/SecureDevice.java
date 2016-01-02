package ro.learnstuff.implementation;

import ro.learnstuff.implementation.contract.TemplateMethod;

public class SecureDevice extends TemplateMethod{

	@Override
	public void start() {
		System.out.println("Secure Start!");
	}

	@Override
	public void finish() {
		System.out.println("Secure Finish!");
	}

	@Override
	public void task() {
		System.out.println("Secure Task!");
	}

}
