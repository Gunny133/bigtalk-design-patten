package com.gunny.decorator;

public class ConcreteDecoratorA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        //增加职责
        addState();
    }

    public void addState() {
        System.out.println("add state...");
    }
}
