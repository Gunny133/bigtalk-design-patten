package com.gunny.template.method;

public class TemplateClient {
    public static void main(String[] args) {
        AbstractClass t;
        t = new ConcreteClassA();
        t.templateMehtod();

        t = new ConcreteClassB();
        t.templateMehtod();
    }
}
