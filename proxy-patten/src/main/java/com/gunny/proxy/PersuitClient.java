package com.gunny.proxy;

public class PersuitClient {
    public static void main(String[] args) {
        Proxy p = new Proxy(new SchoolGirl("mm"));
        p.giveChocolate();
        p.giveDolls();
        p.giveFlower();
    }
}
