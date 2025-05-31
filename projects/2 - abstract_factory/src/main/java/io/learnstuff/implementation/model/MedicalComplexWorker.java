package io.learnstuff.implementation.model;

import io.learnstuff.implementation.contracts.ComplexWorker;

public class MedicalComplexWorker implements ComplexWorker {

    @Override
    public void work() {
        System.out.println("Complex medical work!");
    }

}
