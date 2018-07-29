package com.gunny.decorator.avatar;

public class Tshirt extends Finery {
    public Tshirt(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("T shirt");
        super.show();
    }
}
