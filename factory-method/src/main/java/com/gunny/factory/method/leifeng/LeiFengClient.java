package com.gunny.factory.method.leifeng;

public class LeiFengClient {
    public static void main(String[] args) {
        //换成志愿者只需要修改一处
        LFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeifeng();
        student.buyRice();
        student.sweep();
        student.wash();
    }

}
