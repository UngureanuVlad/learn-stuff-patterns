package ro.learnstuff.implementation;

import ro.learnstuff.model.Original;

public class InheritenceDecorator extends Original{

	public void doExtendedWork(){
		this.extendedWork();
		super.work();
	}
	
	public void extendedWork(){
		System.out.print("Extended: ");
	}
}
