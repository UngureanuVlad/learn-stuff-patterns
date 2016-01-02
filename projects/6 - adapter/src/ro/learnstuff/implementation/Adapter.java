package ro.learnstuff.implementation;

import java.util.List;

import ro.learnstuff.implementation.contract.ListPrinter;

public class Adapter implements ListPrinter {

	@Override
	public void printList(List<String> stringList) {
		String listString = "";

		for (String s : stringList) {
			listString += s + "\t";
		}
		Printer printer = new Printer();
		printer.print(listString);

	}

}
