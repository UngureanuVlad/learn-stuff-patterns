package ro.learnstuff.implementation;

public class ComplexPrototype extends Prototype {

	@Override
	public Prototype instance() {
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public void complexProcess() {
		System.out.println("Complex Process!");
	}

}
