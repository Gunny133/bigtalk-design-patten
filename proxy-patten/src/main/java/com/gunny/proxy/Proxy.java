package com.gunny.proxy;

public class Proxy implements IGiveGift {
    private Persuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Persuit(mm);
    }

    public void giveDolls() {
        gg.giveDolls();
    }

    public void giveFlower() {
        gg.giveFlower();
    }

    public void giveChocolate() {
        gg.giveChocolate();
    }
}
