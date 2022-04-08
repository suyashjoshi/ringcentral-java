package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsCallsDurationByType
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public PerformanceCallsTimersResponseOptionsCallsDurationByType aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public PerformanceCallsTimersResponseOptionsCallsDurationByType aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}