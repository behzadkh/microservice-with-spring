package com.in28minutes.microservices.limitsservice;

public class LimitConfiguration {

    private int max;
    private int min;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
