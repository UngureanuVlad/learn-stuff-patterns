package ro.leanrstuff.main;

import java.util.ArrayList;
import java.util.List;

import ro.leanrstuff.implementation.NosyVisitor;
import ro.leanrstuff.implementation.contract.Visitable;
import ro.leanrstuff.model.ComplexElement;
import ro.leanrstuff.model.SimpleElement;

public class VisitorMain {

	public static void main(String[] args) {
		List<Visitable> items = new ArrayList<>();
		items.add(new SimpleElement());
		items.add(new ComplexElement());
		NosyVisitor visitor = new NosyVisitor();
		for (Visitable item : items)
		{
			item.accept(visitor);
		}
	}
}
