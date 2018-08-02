package com.gunny.factory.method.caculator;

import com.gunny.simple.factory.Operation;
import com.gunny.simple.factory.OperationMulti;

public class MultiFactory implements IFactory {
    public Operation createOperation() {
        return new OperationMulti();
    }
}
