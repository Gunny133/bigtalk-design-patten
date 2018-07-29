package com.gunny.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Component c = new ConcreteComponent();
        Decorator d1 = new ConcreteDecoratorA();
        Decorator d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
