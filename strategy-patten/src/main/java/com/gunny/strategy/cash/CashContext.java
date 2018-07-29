package com.gunny.strategy.cash;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 策略与简单工厂结合，将实例化具体策略的过程由客户端转移到Context中
     * @param type
     */
    public CashContext(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "100 off every 300 spent":
                cashSuper = new CashReturn(300, 100);
                break;
            case "20% off":
                cashSuper = new CashRebate(0.8);
                break;
        }
        this.cashSuper = cashSuper;
    }

    public double ContextAcceptcash(double money) {
        return cashSuper.acceptCash(money);
    }
}
