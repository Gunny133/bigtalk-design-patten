package com.gunny.factory.method.caculator;

import com.gunny.simple.factory.Operation;
import com.gunny.simple.factory.OperationPlus;

public class PlusFacoty implements IFactory {
    public Operation createOperation() {
        return new OperationPlus();
    }
}
