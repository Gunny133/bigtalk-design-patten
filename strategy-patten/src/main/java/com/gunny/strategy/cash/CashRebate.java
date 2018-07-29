package com.gunny.strategy.cash;

public class CashRebate extends CashSuper {
    private double rebate = 1d;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    public double acceptCash(double money) {
        return money*rebate;
    }
}
