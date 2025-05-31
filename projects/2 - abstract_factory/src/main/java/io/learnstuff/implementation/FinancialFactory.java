package io.learnstuff.implementation;

import io.learnstuff.implementation.contracts.AbstractFactory;
import io.learnstuff.implementation.contracts.ComplexWorker;
import io.learnstuff.implementation.contracts.SimpleWorker;
import io.learnstuff.implementation.model.FinancialComplexWorker;
import io.learnstuff.implementation.model.FinancialSimpleWorker;

/**
 * <p>Concrete implementation of AbstractFactory</p>
 *
 * @author Vlad Ungureanu
 */
public class FinancialFactory implements AbstractFactory {

    @Override
    public SimpleWorker getSimpleWorker() {
        return new FinancialSimpleWorker();
    }

    @Override
    public ComplexWorker getComplexWorker() {
        return new FinancialComplexWorker();
    }

}
