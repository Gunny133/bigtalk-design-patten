package com.gunny.factory.method.caculator;

import com.gunny.simple.factory.Operation;
import com.gunny.simple.factory.OperationDiv;

public class DivFactory implements IFactory {
    public Operation createOperation() {
        return new OperationDiv();
    }
}
