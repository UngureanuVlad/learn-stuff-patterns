package ro.learnstuff.implementation.contract;

public abstract class TemplateMethod {

	public abstract void start();
	public abstract void finish();
	public abstract void task();
	
	public void use(){
		this.start();
		this.task();
		this.finish();
	}
}
