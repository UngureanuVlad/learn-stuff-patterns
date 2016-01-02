package ro.learnstuff.implementation;

import java.util.ArrayList;
import java.util.List;

import ro.learnstuff.implementation.contract.Component;

public class Composite {

	private List<Component> components = new ArrayList<>();

	public void add(Component component) {
		this.components.add(component);
	}

	public void remove(Component component) {
		this.components.remove(component);
	}

	public void work() {
		for (Component component : this.components) {
			component.work();
		}

	}
}
