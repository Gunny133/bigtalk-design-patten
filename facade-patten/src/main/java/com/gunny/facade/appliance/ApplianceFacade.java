package com.gunny.facade.appliance;

public class ApplianceFacade {
    private AirCondition airCondition;
    private Light light;
    private Television tv;

    public ApplianceFacade(AirCondition airCondition, Light light, Television tv) {
        this.airCondition = airCondition;
        this.light = light;
        this.tv = tv;
    }

    public void on() {
        airCondition.on();
        tv.on();
        light.on();
    }

    public void off() {
        airCondition.off();
        tv.off();
        light.off();
    }
}
