package com.ringcentral.definitions;


/**
 * Sync information (type, token and time)
 */
public class SyncInfoCallLog {
    /**
     * Type of synchronization
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Synchronization token
     */
    public String syncToken;
    /**
     * The last synchronization datetime in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String syncTime;

    public SyncInfoCallLog syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncInfoCallLog syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncInfoCallLog syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
}
