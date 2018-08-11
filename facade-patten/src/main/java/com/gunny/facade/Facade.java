package com.gunny.facade;

public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
    }

    public void methodA() {
        System.out.println("方法组A（）--------");
        one.methodOne();
        two.methodTwo();
        three.methodThree();
    }

    public void methodB() {
        System.out.println("方法组B（）--------");
        two.methodTwo();
        three.methodThree();
    }
}
