package com.ringcentral.definitions;


public class PerformanceCallsCountersResponseOptionsCallsByResponse {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsCountersResponseOptionsCallsByResponse aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsCountersResponseOptionsCallsByResponse aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
