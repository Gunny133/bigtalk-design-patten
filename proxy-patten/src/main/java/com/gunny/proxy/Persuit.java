package com.gunny.proxy;

public class Persuit implements IGiveGift {
    private SchoolGirl mm;

    public Persuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println(mm.getName()+" give you dolls");
    }

    public void giveFlower() {
        System.out.println(mm.getName() + " give you flower");
    }

    public void giveChocolate() {
        System.out.println(mm.getName()+ " give you chocolate");
    }
}
