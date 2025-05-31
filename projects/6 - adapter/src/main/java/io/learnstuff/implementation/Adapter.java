package io.learnstuff.implementation;

import io.learnstuff.implementation.contract.ListPrinter;

import java.util.List;

/**
 * <p>Considerations:</p>
 * <ul>
 * 	<li>Extra layer of abstraction, in an effort to make old interfaces usable.</li>
 * 	<li>Adapter overlap Bridge, Strategy and State design patterns.</li>
 * 	<li>Unless unavoidable, new implementation are favoured legacy code due to security and performance concerns.</li>
 * </ul>
 *
 * @author Vlad Ungureanu
 */
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
