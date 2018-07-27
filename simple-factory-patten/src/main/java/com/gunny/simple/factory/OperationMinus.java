package com.gunny.simple.factory;

public class OperationMinus extends Operation {
    @Override
    double getResult() {
        return numberA-numberB;
    }
}
