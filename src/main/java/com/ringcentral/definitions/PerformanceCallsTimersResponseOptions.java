package com.ringcentral.definitions;


// Performance calls timers
public class PerformanceCallsTimersResponseOptions {
    /**
     *
     */
    public PerformanceCallsTimer allCallsDuration;
    /**
     *
     */
    public PerformanceCallsTimer callsSegmentsDuration;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByDirection;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByOrigin;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByResponse;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByResponseType;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByResult;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByCompanyHours;
    /**
     *
     */
    public PerformanceCallsTimer callsDurationByQueueSla;

    public PerformanceCallsTimersResponseOptions allCallsDuration(PerformanceCallsTimer allCallsDuration) {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsSegmentsDuration(PerformanceCallsTimer callsSegmentsDuration) {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByDirection(PerformanceCallsTimer callsDurationByDirection) {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByOrigin(PerformanceCallsTimer callsDurationByOrigin) {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByResponse(PerformanceCallsTimer callsDurationByResponse) {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByResponseType(PerformanceCallsTimer callsDurationByResponseType) {
        this.callsDurationByResponseType = callsDurationByResponseType;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByResult(PerformanceCallsTimer callsDurationByResult) {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByCompanyHours(PerformanceCallsTimer callsDurationByCompanyHours) {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByQueueSla(PerformanceCallsTimer callsDurationByQueueSla) {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }
}
