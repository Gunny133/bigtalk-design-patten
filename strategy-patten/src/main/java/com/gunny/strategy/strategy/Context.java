package com.gunny.strategy.strategy;

public class Context {
 private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.AlgorithmInterface();
    }
}
