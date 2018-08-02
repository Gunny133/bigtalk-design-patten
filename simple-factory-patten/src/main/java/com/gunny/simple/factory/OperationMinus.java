package com.gunny.simple.factory;

public class OperationMinus extends Operation {
    @Override
    public double getResult() {
        return numberA-numberB;
    }
}
