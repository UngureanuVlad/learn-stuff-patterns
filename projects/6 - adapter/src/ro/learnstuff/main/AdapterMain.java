package ro.learnstuff.main;

import java.util.ArrayList;
import java.util.List;

import ro.learnstuff.implementation.Adapter;
import ro.learnstuff.implementation.contract.ListPrinter;

public class AdapterMain {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");

		ListPrinter adapter = new Adapter();
		adapter.printList(stringList);
	}
}
