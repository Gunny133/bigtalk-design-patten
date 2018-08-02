package com.gunny.factory.method.caculator;

import com.gunny.simple.factory.Operation;

public class Calculator {
    public static void main(String[] args) {
        IFactory operFactory = new PlusFacoty();
        Operation oper = operFactory.createOperation();
        oper.numberA = 10;
        oper.numberB = 20;
        System.out.println(oper.getResult());
    }
}
