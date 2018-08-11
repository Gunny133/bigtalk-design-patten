package com.gunny.factory.method.leifeng;

public class VolunteerFacoty implements LFactory {
    public LeiFeng createLeifeng() {
        return new Volunteer();
    }
}
