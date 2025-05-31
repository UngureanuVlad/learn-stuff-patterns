package io.learnstuff.main;

import io.learnstuff.implementation.Adapter;
import io.learnstuff.implementation.contract.ListPrinter;

import java.util.ArrayList;
import java.util.List;

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
