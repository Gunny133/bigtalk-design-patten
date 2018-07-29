package com.gunny.decorator.avatar;

public class Suit extends Finery {
    public Suit(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("suit");
        super.show();
    }
}
