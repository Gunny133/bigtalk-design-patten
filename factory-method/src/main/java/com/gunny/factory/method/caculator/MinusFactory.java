package com.gunny.factory.method.caculator;

import com.gunny.simple.factory.Operation;
import com.gunny.simple.factory.OperationMinus;

public class MinusFactory implements IFactory {
    public Operation createOperation() {
        return new OperationMinus();
    }
}
