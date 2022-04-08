package com.ringcentral.definitions;


/**
 * Specifies an extension (a calling group) which should be used for the missed call transfer. Returned only if the `actionType` is set to 'ConnectToExtension'
 */
public class MissedCallExtensionInfo {
    /**
     * Internal identifier of an extension which should be used for the missed call transfer
     */
    public String id;
    /**
     *
     */
    public MissedCallExtensionInfoExternalNumber externalNumber;

    public MissedCallExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public MissedCallExtensionInfo externalNumber(MissedCallExtensionInfoExternalNumber externalNumber) {
        this.externalNumber = externalNumber;
        return this;
    }
}
