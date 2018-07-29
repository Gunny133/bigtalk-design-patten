package com.gunny.decorator.avatar;

public abstract class Finery extends Person {
    private Person person;

    public Finery(Person person) {
        this.person = person;
    }

    public void show() {
        person.show();
    }
}
