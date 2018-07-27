package com.gunny.simple.factory;
public class Caculator {
    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        System.out.println("The operation result is: "+oper.getResult());
    }
}
