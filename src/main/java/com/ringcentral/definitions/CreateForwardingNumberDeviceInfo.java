package com.ringcentral.definitions;


/**
 * Forwarding device information. Applicable for 'PhoneLine' type only. Cannot be specified together with 'phoneNumber' parameter
 */
public class CreateForwardingNumberDeviceInfo {
    /**
     * Internal identifier of the other extension device
     */
    public String id;

    public CreateForwardingNumberDeviceInfo id(String id) {
        this.id = id;
        return this;
    }
}
