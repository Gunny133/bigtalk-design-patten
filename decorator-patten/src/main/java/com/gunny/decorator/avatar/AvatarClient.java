package com.gunny.decorator.avatar;

public class AvatarClient {
    public static void main(String[] args) {
        Person p = new Person("Zhansan");
        Finery s = new Suit(p);
        Finery t = new Tie(s);
        t.show();
        Finery tt = new Tie(new Suit(new Person("Lisi")));
        tt.show();
    }
}
