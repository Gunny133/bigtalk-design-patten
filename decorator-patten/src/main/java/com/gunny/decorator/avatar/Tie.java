package com.gunny.decorator.avatar;

public class Tie extends Finery {
    public Tie(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("tie");
        super.show();
    }
}
