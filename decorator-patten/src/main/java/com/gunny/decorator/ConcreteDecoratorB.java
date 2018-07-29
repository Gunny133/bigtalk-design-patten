package com.gunny.decorator;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        //add responsibility
        addBehavior();
    }

    public void addBehavior() {
        System.out.println("add behavior");
    }
}
