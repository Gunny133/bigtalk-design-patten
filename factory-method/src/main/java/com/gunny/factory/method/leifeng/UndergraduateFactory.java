package com.gunny.factory.method.leifeng;

public class UndergraduateFactory implements LFactory {
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
