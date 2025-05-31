package io.learnstuff.implementation;

import io.learnstuff.implementation.contracts.AbstractFactory;
import io.learnstuff.implementation.contracts.ComplexWorker;
import io.learnstuff.implementation.contracts.SimpleWorker;
import io.learnstuff.implementation.model.MedicalComplexWorker;
import io.learnstuff.implementation.model.MedicalSimpleWorker;

/**
 * <p>Concrete implementation of AbstractFactory</p>
 *
 * @author Vlad Ungureanu
 */
public class MedicalFactory implements AbstractFactory {

    @Override
    public SimpleWorker getSimpleWorker() {
        return new MedicalSimpleWorker();
    }

    @Override
    public ComplexWorker getComplexWorker() {
        return new MedicalComplexWorker();
    }

}
