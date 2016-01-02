package ro.learnstuff.implementation;

public enum SingletonEnum {
	Instance;

	private SingletonEnum() {
	}

	public void dostuff() {
		System.out.println("Some heavy operation!");
	}

}
