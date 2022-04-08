package com.ringcentral.definitions;


/**
 * GCM data
 */
public class GCMInfo {
    /**
     * Notification priority, if the value is &#039;high&#039; then notification is turned on even if the application is in background
     * Enum: high, normal
     */
    public String priority;
    /**
     * Notification lifetime value in seconds, the default value is 30 seconds
     */
    public Long time_to_live;
    /**
     *
     */
    public GCMData data;

    public GCMInfo priority(String priority) {
        this.priority = priority;
        return this;
    }

    public GCMInfo time_to_live(Long time_to_live) {
        this.time_to_live = time_to_live;
        return this;
    }

    public GCMInfo data(GCMData data) {
        this.data = data;
        return this;
    }
}
