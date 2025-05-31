package io.leanrstuff.main;

import io.leanrstuff.implementation.NosyVisitor;
import io.leanrstuff.implementation.contract.Visitable;
import io.leanrstuff.model.ComplexElement;
import io.leanrstuff.model.SimpleElement;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {

    public static void main(String[] args) {
        List<Visitable> items = new ArrayList<>();
        items.add(new SimpleElement());
        items.add(new ComplexElement());
        NosyVisitor visitor = new NosyVisitor();
        for (Visitable item : items) {
            item.accept(visitor);
        }
    }
}
