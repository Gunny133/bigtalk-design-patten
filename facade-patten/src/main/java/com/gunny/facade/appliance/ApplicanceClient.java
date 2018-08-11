package com.gunny.facade.appliance;

public class ApplicanceClient {
    public static void main(String[] args) {
        ApplianceFacade facade = new ApplianceFacade(new AirCondition(), new Light(), new Television());
        //get up
        System.out.println("起床了...");
        facade.on();
        //go to bed
        System.out.println("睡觉了...");
        facade.off();
    }
}
