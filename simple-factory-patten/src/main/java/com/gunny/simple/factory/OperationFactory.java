package com.gunny.simple.factory;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationPlus();break;
            case "-":
                oper = new OperationMinus();break;
            case "*":
                oper = new OperationMulti();break;
            case "/" :
                oper = new OperationDiv();break;
        }
        return oper;
    }

}

