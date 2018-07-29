package com.gunny.strategy.cash;

public class CashClient {
    public static void main(String[] args) {
        double totalPrice = 400d;
        CashContext cashContext = new CashContext("normal");
        System.out.println(cashContext.ContextAcceptcash(totalPrice));

    }
}
